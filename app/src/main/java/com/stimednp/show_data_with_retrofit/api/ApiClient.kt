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
    val getClient: ServiceThesportDB
        get() {
            val gson = GsonBuilder().setLenient().create()
            val inteceptor = HttpLoggingInterceptor()
            inteceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder().addInterceptor(inteceptor).build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            return retrofit.create(ServiceThesportDB::class.java)
        }
}