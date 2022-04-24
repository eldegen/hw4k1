package com.example.hw4k1.ui.activties.main

import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.hw4k1.PagerAdapter
import com.example.hw4k1.base.BaseActivity
import com.example.hw4k1.databinding.ActivityMainBinding
import com.example.hw4k1.ui.fragments.main.MainFragment
import com.example.hw4k1.ui.fragments.second.SecondFragment
import com.example.hw4k1.ui.fragments.third.ThirdFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var adapter: PagerAdapter

    override fun inflateVB(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun initView() {
        adapter = PagerAdapter(supportFragmentManager, lifecycle)

        adapter.addFragment(MainFragment())
        adapter.addFragment(SecondFragment())
        adapter.addFragment(ThirdFragment())

        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager.adapter = this.adapter

        Log.d("bruh", "initView: " + adapter.itemCount)

        Toast.makeText(this, "a", Toast.LENGTH_SHORT).show()
    }

    override fun initListeners() {

    }

    override fun otherThings() {

    }

}

/*
- Добавить ViewPager из 3 фрагментов в MainActivity
- 1 фрагмент кнопки ‘+’ и ‘-’, при нажатии вызывать соответствующие методы у ViewModel и выполнять необходимую логику
- 2 фрагмент отображает текущее значение LiveData счетчика
- 3 фрагмент отображает список выполненных операций (просто список строковых значений, который наблюдаются у ViewModel-a)
- Для всех задач использовать один ViewModel
*/
