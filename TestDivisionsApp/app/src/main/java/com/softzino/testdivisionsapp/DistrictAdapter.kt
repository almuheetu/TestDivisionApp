package com.softzino.testdivisionsapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import com.softzino.testdivisionsapp.databinding.AdapterDistrictBinding
import com.softzino.testdivisionsapp.model.DivisionResponseItem

class DistrictAdapter(
    private val districtList: ArrayList<DivisionResponseItem>
) : RecyclerView.Adapter<DistrictAdapter.ViewHolder>() {
    class ViewHolder(var binding: AdapterDistrictBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            AdapterDistrictBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val district = districtList[position]
        viewHolder.binding.tvDistrictName.text = district.name
    }

    override fun getItemCount(): Int {
        return districtList.size
    }



}