package com.softzino.testdivisionsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.softzino.testdivisionsapp.databinding.FragmentDistrictListBinding
import com.softzino.testdivisionsapp.placeholder.PlaceholderContent
import com.softzino.testdivisionsapp.repositories.DivisionRepository
import com.softzino.testdivisionsapp.viewmodels.DivisionViewModel

class DistrictFragment : Fragment() {
    private lateinit var binding: FragmentDistrictListBinding
    private lateinit var districtAdapter: DistrictAdapter
    private lateinit var viewModel: DivisionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDistrictListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.districtRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        viewModel = DivisionViewModel(DivisionRepository())
        viewModel.getDivision()
        viewModel.items.observe(viewLifecycleOwner) {
            it?.let {

            }


        }
    }
}