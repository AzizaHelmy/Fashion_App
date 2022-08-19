package com.example.mensfashion.ui.home.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mensfashion.databinding.ItemRvHomBinding
import com.example.mensfashion.ui.home.model.HomeModelItem

class HomeAdapter(private var homeLisy:List<HomeModelItem>,private val onClick: IHomeOnClick) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    private var homeList: List<HomeModelItem> = ArrayList()

    fun setData() {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            ItemRvHomBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(homeList[position])
    }

    override fun getItemCount(): Int = homeList.size


    inner class HomeViewHolder(val binding: ItemRvHomBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: HomeModelItem) {
            binding.tvName.text = "fashion dress"
            binding.tvPrice.text = "100.00"

        }
    }
}