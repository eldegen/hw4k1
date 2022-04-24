package com.example.hw4k1.ui.activities.main

import android.view.LayoutInflater
import androidx.viewpager2.widget.ViewPager2
import com.example.hw4k1.adapters.PagerAdapter
import com.example.hw4k1.base.BaseActivity
import com.example.hw4k1.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var adapter: PagerAdapter

    override fun inflateVB(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun initView() {
        adapter = PagerAdapter(this)

        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager.adapter = this.adapter
    }

    override fun initListeners() {

    }

    override fun otherThings() {

    }

}
