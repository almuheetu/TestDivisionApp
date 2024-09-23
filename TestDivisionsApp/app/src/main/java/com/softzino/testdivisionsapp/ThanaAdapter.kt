package com.softzino.testdivisionsapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.softzino.testdivisionsapp.placeholder.PlaceholderContent.PlaceholderItem
import com.softzino.testdivisionsapp.databinding.AdapterThanaBinding


class ThanaAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<ThanaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            AdapterThanaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id
        holder.contentView.text = item.content
    }

    override fun getItemCount(): Int = values.size



}