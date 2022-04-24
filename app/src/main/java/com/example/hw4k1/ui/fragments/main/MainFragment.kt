package com.example.hw4k1.ui.fragments.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.example.hw4k1.base.BaseFragment
import com.example.hw4k1.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {
    override fun inflateVB(
        inflater: LayoutInflater,
        container: ViewGroup?,
        b: Boolean
    ): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        binding.btnIncrease.setOnClickListener {
            Toast.makeText(context, "a", Toast.LENGTH_SHORT).show()
        }
    }

    override fun initListeners() {

    }

    override fun otherThings() {

    }


}