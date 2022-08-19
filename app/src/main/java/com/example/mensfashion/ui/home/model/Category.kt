package com.example.mensfashion.ui.home.model


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("category_id")
    val categoryId: Int,
    @SerializedName("category_name")
    val categoryName: String,
    @SerializedName("section")
    val section: Section
)