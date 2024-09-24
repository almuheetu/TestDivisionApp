package com.softzino.testdivisionsapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.softzino.testdivisionsapp.placeholder.PlaceholderContent.PlaceholderItem
import com.softzino.testdivisionsapp.databinding.AdapterThanaBinding
import com.softzino.testdivisionsapp.model.DivisionResponseItem
import com.softzino.testdivisionsapp.model.Thana


class ThanaAdapter(
    private val thanaList: List<Thana>
) : RecyclerView.Adapter<ThanaAdapter.ViewHolder>() {
    class ViewHolder(var binding: AdapterThanaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            AdapterThanaBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val thana = thanaList[position]
        viewHolder.binding.tvThanaName.text = thana.name
    }

    override fun getItemCount(): Int {
        return thanaList.size
    }

}