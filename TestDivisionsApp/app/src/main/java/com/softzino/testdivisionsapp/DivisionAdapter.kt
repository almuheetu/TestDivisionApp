package com.softzino.testdivisionsapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.softzino.testdivisionsapp.placeholder.PlaceholderContent.PlaceholderItem
import com.softzino.testdivisionsapp.databinding.AdapterDivisionBinding
import com.softzino.testdivisionsapp.model.DivisionResponseItem


class DivisionAdapter(
    private val divisionList: ArrayList<DivisionResponseItem>
) : RecyclerView.Adapter<DivisionAdapter.ViewHolder>() {
    class ViewHolder(var binding: AdapterDivisionBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            AdapterDivisionBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val division = divisionList[position]
        viewHolder.binding.tvDivisionName.text = division.name
    }

    override fun getItemCount(): Int {
        return divisionList.size

    }


}