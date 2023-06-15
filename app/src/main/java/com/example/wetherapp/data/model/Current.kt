package com.example.wetherapp.data.model

import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("cloud")
    val cloud: Int,
    @SerializedName("condition")
    val condition: Condition,
    @SerializedName("feelslike_c")
    val feeLsLikec: Double,
    @SerializedName("feelslike_f")
    val feeLsLikef: Double,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("is_day")
    val isDay: Int,
    @SerializedName("last_updated")
    val lastUpdated: String,
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int,
    @SerializedName("precip_in")
    val precipIn: Double,
    @SerializedName("precip_mm")
    val precipMm: Double,
    @SerializedName("pressure_in")
    val pressureIn: Double,
    @SerializedName("temp_C")
    val tempC: Double,
    @SerializedName("wind_kph")
    val windKph: Double,
)