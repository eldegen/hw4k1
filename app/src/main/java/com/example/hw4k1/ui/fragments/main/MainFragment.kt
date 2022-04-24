package com.example.hw4k1.ui.fragments.main

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.hw4k1.viewmodels.SharedViewModel
import com.example.hw4k1.base.BaseFragment
import com.example.hw4k1.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    private val viewModel: SharedViewModel by activityViewModels()

    override fun inflateVB(
        inflater: LayoutInflater,
        container: ViewGroup?,
        b: Boolean
    ): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater, container, false)
    }

    override fun initView() {

    }

    override fun initListeners() {
        binding.btnIncrease.setOnClickListener {
            viewModel.increaseCounter()
            viewModel.setStatus(true)
        }

        binding.btnDecrease.setOnClickListener {
            viewModel.decreaseCounter()
            viewModel.setStatus(false)
        }
    }

    override fun initObservers() {
        viewModel.counter.observe(this) { counter ->
            Log.d("bruh", "initObservers: $counter")
        }
    }

    override fun otherThings() {

    }

}