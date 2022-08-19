package com.example.mensfashion.ui.home.model


import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("cane_request_more_then_one")
    val caneRequestMoreThenOne: Boolean,
    @SerializedName("expire_date")
    val expireDate: String,
    @SerializedName("hase_offer")
    val haseOffer: Boolean,
    @SerializedName("new_price")
    val newPrice: Double,
    @SerializedName("old_price")
    val oldPrice: Double
)