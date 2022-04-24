package com.example.hw4k1.ui.fragments.main

import android.view.LayoutInflater
import com.example.hw4k1.base.BaseFragment
import com.example.hw4k1.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {
    override fun inflateVB(inflater: LayoutInflater): FragmentMainBinding {
        return FragmentMainBinding.inflate(LayoutInflater.from(requireContext()))
    }

    override fun initView() {

    }

    override fun initListeners() {

    }

    override fun otherThings() {

    }

}