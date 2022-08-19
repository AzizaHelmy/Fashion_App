package com.example.mensfashion.ui.home.model


import com.google.gson.annotations.SerializedName

data class Size(
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("size_id")
    val sizeId: Int,
    @SerializedName("size_name")
    val sizeName: String
)