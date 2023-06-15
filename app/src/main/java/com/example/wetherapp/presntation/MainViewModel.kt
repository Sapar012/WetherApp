package com.example.wetherapp.presntation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wetherapp.data.model.MainRespons
import com.example.wetherapp.data.remute.repo.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class MainViewModel(
    private val repository: WeatherRepository
):ViewModel() {

    var liveData :  LiveData<MainRespons> = MutableLiveData()

    fun getWeather(cityName:String){
        liveData = repository.getWeather(cityName)
    }
}