package com.example.mensfashion.ui.home.model


import com.google.gson.annotations.SerializedName

data class Section(
    @SerializedName("section_id")
    val sectionId: Int,
    @SerializedName("section_name")
    val sectionName: String
)