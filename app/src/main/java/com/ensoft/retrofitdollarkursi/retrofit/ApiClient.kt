package com.ensoft.retrofitdollarkursi.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    val BASE_URL = "https://cbu.uz/en/arkhiv-kursov-valyut/"
    fun getRetrofit() : Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
}
