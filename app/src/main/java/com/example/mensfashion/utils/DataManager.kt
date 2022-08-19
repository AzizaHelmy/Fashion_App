package com.example.mensfashion.utils

import com.example.mensfashion.R
import com.example.mensfashion.ui.home.model.HomeModelItem

object DataManager {
    val list = ArrayList<HomeModelItem>()

    init {
        initializeHomeList()
    }

    private fun initializeHomeList() {
        var item = HomeModelItem(
            price = "100.00",
            productName = "sdiu",
            productId = "",
            productImages = R.drawable.dress
        )
        list.add(item)
        item = HomeModelItem(
            price = "200.00",
            productName = "Azza",
            productId = "",
            productImages = R.drawable.dress3
        )
        list.add(item)
        item = HomeModelItem(
            price = "10.00",
            productName = "kjuyt",
            productId = "",
            productImages = R.drawable.dress
        )
        list.add(item)
        item = HomeModelItem(
            price = "34.00",
            productName = "lkoij",
            productId = "",
            productImages = R.drawable.dress
        )
        list.add(item)
        item = HomeModelItem(
            price = "09",
            productName = "sef",
            productId = "",
            productImages = R.drawable.dress
        )
        list.add(item)
    }
}