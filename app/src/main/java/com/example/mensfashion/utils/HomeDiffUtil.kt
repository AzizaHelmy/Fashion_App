package com.example.mensfashion.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.mensfashion.ui.home.model.HomeModelItem

class HomeDiffUtil(
    private val oldList: List<HomeModelItem>,
    private val newList: List<HomeModelItem>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition] === newList[newItemPosition]

    override fun areContentsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean = oldList[oldItemPosition] == newList[newItemPosition]
}