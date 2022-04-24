package com.example.hw4k1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw4k1.ui.fragments.main.MainFragment
import com.example.hw4k1.ui.fragments.second.SecondFragment
import com.example.hw4k1.ui.fragments.third.ThirdFragment


class PagerAdapter(fa: FragmentActivity) :   FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 3}

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            MainFragment()
        } else if (position == 1) {
            SecondFragment()
        } else {
            ThirdFragment()
        }
    }

}