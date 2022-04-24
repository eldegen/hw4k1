package com.example.hw4k1.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding> : Fragment() {

    protected lateinit var binding: VB
    protected abstract fun inflateVB(inflater: LayoutInflater): VB

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = inflateVB(layoutInflater)

        initView()
        initListeners()
        otherThings()
    }

    abstract fun initView()

    abstract fun initListeners()

    abstract fun otherThings()

}