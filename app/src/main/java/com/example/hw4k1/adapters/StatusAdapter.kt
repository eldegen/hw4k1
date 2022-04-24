package com.example.hw4k1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw4k1.R
import com.example.hw4k1.databinding.ItemStatBinding

class StatusAdapter(private var status: ArrayList<Boolean>) : RecyclerView.Adapter<StatusAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemStatBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            if (status[position]) {
                binding.status.setImageResource(R.drawable.ic_plus_one)
            } else {
                binding.status.setImageResource(R.drawable.ic_neg_one)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemStatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return status.size
    }

}