package com.stimednp.show_data_with_retrofit.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by rivaldy on 11/8/2019.
 */

interface ServiceThesportDB {
    @GET("api/v1/json/1/lookupleague.php?")
    fun getDetailLeaguaById(@Query("id") id: Int?): Call<ResponseThesportDB>

    @GET("api/v1/json/1/all_leagues.php")
    fun getAllLeagues(): Call<ResponseThesportDB>
}