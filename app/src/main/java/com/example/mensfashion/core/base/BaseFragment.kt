package com.example.mensfashion.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.mensfashion.App

abstract class BaseFragment<bindingObj : ViewDataBinding> : Fragment() {
    // set view binding in the child class
    abstract fun setViewBinding(): bindingObj


    private var _binding: bindingObj? = null
    val binding: bindingObj get() = _binding!!
    val pref = App.pref   // return a reference to SecureSharedPreferences you can use it in any fragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = setViewBinding()

        _binding?.let {
            it.executePendingBindings()
            it.lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null   // destroy the view binding
    }
}