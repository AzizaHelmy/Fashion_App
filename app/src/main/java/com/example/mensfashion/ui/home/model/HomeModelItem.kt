package com.example.mensfashion.ui.home.model


import com.google.gson.annotations.SerializedName

data class HomeModelItem(
    @SerializedName("category")
    val category: Category,
    @SerializedName("color")
    val color: List<Color>,
    @SerializedName("out_of_stock")
    val outOfStock: Boolean,
    @SerializedName("price")
    val price: Price,
    @SerializedName("product_description")
    val productDescription: String,
    @SerializedName("product_id")
    val productId: String,
    @SerializedName("product_images")
    val productImages: List<String>,
    @SerializedName("product_name")
    val productName: String
)