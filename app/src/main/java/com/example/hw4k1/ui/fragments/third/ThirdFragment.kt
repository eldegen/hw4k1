package com.example.hw4k1.ui.fragments.third

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.hw4k1.adapters.StatusAdapter
import com.example.hw4k1.base.BaseFragment
import com.example.hw4k1.databinding.FragmentThirdBinding
import com.example.hw4k1.viewmodels.SharedViewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding>() {

    private lateinit var adapter: StatusAdapter
    private var status = arrayListOf<Boolean>()
    private val viewModel: SharedViewModel by activityViewModels()

    override fun inflateVB(
        inflater: LayoutInflater,
        container: ViewGroup?,
        b: Boolean
    ): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        viewModel.status.observe(this) {
            status = it
            Log.d("bruh", "initView: $status")

            adapter = StatusAdapter(status)
            binding.recycler.adapter = adapter
        }
    }

    override fun initListeners() {
    }

    override fun initObservers() {
    }

    override fun otherThings() {
    }

}