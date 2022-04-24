package com.example.hw4k1.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding> : Fragment() {

    protected lateinit var binding: VB
    protected abstract fun inflateVB(inflater: LayoutInflater, container: ViewGroup?, b: Boolean): VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateVB(inflater, container, false)

        initView()
        initListeners()
        initObservers()
        otherThings()

        return binding.root
    }

    abstract fun initView()

    abstract fun initListeners()

    abstract fun initObservers()

    abstract fun otherThings()

}