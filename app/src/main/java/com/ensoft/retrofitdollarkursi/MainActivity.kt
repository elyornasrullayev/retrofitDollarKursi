package com.ensoft.retrofitdollarkursi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ensoft.retrofitdollarkursi.adapter.RvAdapter
import com.ensoft.retrofitdollarkursi.data.User
import com.ensoft.retrofitdollarkursi.retrofit.ApiClient
import com.ensoft.retrofitdollarkursi.retrofit.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var rvAdapter: RvAdapter
    lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview = findViewById(R.id.recyclerview)

        val apiClient = ApiClient()
        val retrofit = apiClient.getRetrofit()
        val apiInterface = retrofit.create(ApiInterface::class.java)
        apiInterface.getUsers().enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                if (response.isSuccessful) {
                    val data = response.body()
                    rvAdapter = RvAdapter(data!!)
                    recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
                    recyclerview.adapter = rvAdapter
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Toast.makeText(applicationContext, "Something is wrong!!", Toast.LENGTH_LONG).show()
                Thread.sleep(5000)
                onDestroy()
            }

        })

    }
}