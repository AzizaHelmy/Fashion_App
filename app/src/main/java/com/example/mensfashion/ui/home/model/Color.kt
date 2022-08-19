package com.example.mensfashion.ui.home.model


import com.google.gson.annotations.SerializedName

data class Color(
    @SerializedName("color_id")
    val colorId: Int,
    @SerializedName("color_name")
    val colorName: String,
    @SerializedName("color_value")
    val colorValue: String,
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("sizes")
    val sizes: List<Size>
)