package com.example.wetherapp.data.model

data class Forecastday(
    val astro: Astro,
    val day: Day,
    val hour: List<Hour>
)