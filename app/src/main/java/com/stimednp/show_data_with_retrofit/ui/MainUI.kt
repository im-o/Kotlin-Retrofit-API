package com.stimednp.show_data_with_retrofit.ui

import androidx.recyclerview.widget.LinearLayoutManager
import com.stimednp.show_data_with_retrofit.R
import com.stimednp.show_data_with_retrofit.api.Leagues
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**
 * Created by rivaldy on 11/10/2019.
 */

class MainUI(val items: ArrayList<Leagues>) : AnkoComponent<MainActivity> {
    companion object{
        val rvMain = R.id.rv_mainui
        var progressBar = R.id.progress_main
    }
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        relativeLayout {
            recyclerView {
                lparams(matchParent, matchParent)
                id = rvMain
                layoutManager = LinearLayoutManager(context)
                adapter = LeagueAdapter(items)
            }
            progressBar {
                id = progressBar
            }.lparams(matchParent, wrapContent){centerInParent()}
        }
    }

}