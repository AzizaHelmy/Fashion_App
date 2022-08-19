package com.example.mensfashion.ui.home.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mensfashion.core.SecureSharedPreferences
import com.example.mensfashion.core.base.BaseFragment
import com.example.mensfashion.databinding.FragmentHomeBinding
import com.example.mensfashion.ui.home.viewmodel.HomeViewModel
import com.example.mensfashion.utils.Constants
import com.example.mensfashion.utils.DataManager

class HomeFragment : BaseFragment<FragmentHomeBinding>(), IHomeOnClick {
    private val homeViewModel: HomeViewModel by viewModels()
    private lateinit var homeAdapter: HomeAdapter
    private lateinit var recommendedAdapter: RecommendedAdapter

    //private var list=ArrayList<HomeModelItem>(HomeModelItem(price = ""))
    override fun setViewBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SecureSharedPreferences.save(true, Constants.IS_LOGIN)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpHomeRecyclerView()
        setUpRecommendedRV()
    }

    private fun setUpRecommendedRV() {
        TODO("Not yet implemented")
    }

    private fun setUpHomeRecyclerView() {

        homeAdapter = HomeAdapter(DataManager.list, this)
        binding.rvFasion.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = homeAdapter
        }
    }

}