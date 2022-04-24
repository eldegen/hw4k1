package com.example.hw4k1.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding> : Fragment() {

    protected lateinit var _binding: VB
    protected val binding get() = _binding!!
    protected abstract fun inflateVB(inflater: LayoutInflater, container: ViewGroup?, b: Boolean): VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflateVB(inflater, container, false)

        initView()
        initListeners()
        otherThings()

        return binding.root
    }

    abstract fun initView()

    abstract fun initListeners()

    abstract fun otherThings()

}