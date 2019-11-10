package com.stimednp.show_data_with_retrofit.api

import com.google.gson.GsonBuilder
import com.stimednp.show_data_with_retrofit.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by rivaldy on 11/8/2019.
 */

object ApiClient {
    var BASE_URL: String = BuildConfig.BASE_URL
    fun retrofit(): ServiceThesportDB {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ServiceThesportDB::class.java)
    }
}