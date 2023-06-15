package com.example.wetherapp.data.remute.repo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.wetherapp.data.model.MainRespons
import com.example.wetherapp.data.remute.service.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val apiService: ApiService) {

    fun getWeather(cityName: String): LiveData<MainRespons> {
        val liveData = MutableLiveData<MainRespons>()
        apiService.getWeather(cityName).enqueue(object : Callback<MainRespons> {
            override fun onResponse(
                call: Call<MainRespons>,
                response: Response<MainRespons>
            ) {
                if (response.isSuccessful) {
                    liveData.value = response.body()
                }
            }
            override fun onFailure(call: Call<MainRespons>, t: Throwable) {
                t.localizedMessage?.let { Log.e("ololo", it.toString() ) }
            }
        })
        return liveData
    }
}