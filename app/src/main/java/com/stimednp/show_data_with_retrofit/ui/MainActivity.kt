package com.stimednp.show_data_with_retrofit.ui

import android.os.Bundle
import android.util.Log.e
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.stimednp.show_data_with_retrofit.R
import com.stimednp.show_data_with_retrofit.api.ApiClient
import com.stimednp.show_data_with_retrofit.api.Leagues
import com.stimednp.show_data_with_retrofit.api.ResponseThesportDB
import org.jetbrains.anko.find
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    var dataList = ArrayList<Leagues>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainUI(dataList).setContentView(this)
        getDataAllLeagues()
    }

    private fun getDataAllLeagues(){
        val call: Call<ResponseThesportDB> = ApiClient.retrofit().getAllLeagues()
        call.enqueue(object : Callback<ResponseThesportDB>{
            override fun onFailure(call: Call<ResponseThesportDB>, t: Throwable) {
                toast("ERRRPR ${t}")
            }

            override fun onResponse(
                call: Call<ResponseThesportDB>,
                response: Response<ResponseThesportDB>
            ) {
                val res: ResponseThesportDB = response.body()!!
                toast("PANJANG ${res.leagues.size}")
                getHasil(res.leagues)
            }

        })
    }

    fun getHasil(response: ArrayList<Leagues>) {
        val rv_main = find<RecyclerView>(R.id.rv_mainui)
        val progress = find<ProgressBar>(R.id.progress_main)

        dataList.addAll(response)
        progress.invisible()
        rv_main.adapter?.notifyDataSetChanged()
    }
}
