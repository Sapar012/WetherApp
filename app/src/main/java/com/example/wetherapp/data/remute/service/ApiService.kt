package com.example.wetherapp.data.remute.service

import com.example.wetherapp.data.model.MainRespons
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("forecast.json")
    fun getWeather(
        @Query("q") cityName:String? = ""
    ):Call<MainRespons>
}