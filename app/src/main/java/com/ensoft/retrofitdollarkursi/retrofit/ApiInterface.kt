package com.ensoft.retrofitdollarkursi.retrofit

import com.ensoft.retrofitdollarkursi.data.User
import retrofit2.Call
import retrofit2.http.GET

interface  ApiInterface {
    @GET("json")
    fun getUsers() : Call<List<User>>
}
