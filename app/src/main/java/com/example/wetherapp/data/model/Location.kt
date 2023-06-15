package com.example.wetherapp.data.model

import com.google.gson.annotations.SerializedName

data class Location(
    val country: String,
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Int,
    val name: String,
    @SerializedName("tz_id")
    val tzId: String
)