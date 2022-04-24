package com.example.hw4k1.ui.fragments.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.hw4k1.viewmodels.SharedViewModel
import com.example.hw4k1.base.BaseFragment
import com.example.hw4k1.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    private val viewModel: SharedViewModel by activityViewModels()

    override fun inflateVB(
        inflater: LayoutInflater,
        container: ViewGroup?,
        b: Boolean
    ): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater, container, false)
    }

    override fun initView() {

    }

    override fun initListeners() {

    }

    override fun initObservers() {
        viewModel.counter.observe(this) {
            binding.tvCounter.text = it.toString()
        }
    }

    override fun otherThings() {

    }

}