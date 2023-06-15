package com.example.wetherapp.presntation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.wetherapp.R
import com.example.wetherapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private val viewModel:MainViewModel by lazy { ViewModelProvider(this)[MainViewModel::class.java] }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getWeather("Bishkek")
        viewModel.liveData.observe(this){
            binding.tvName.text = it.current.tempC.toString()
        }
    }
}