package com.softzino.testdivisionsapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.softzino.testdivisionsapp.databinding.FragmentDivisionListBinding
import com.softzino.testdivisionsapp.model.DivisionResponseItem
import com.softzino.testdivisionsapp.repositories.DivisionRepository
import com.softzino.testdivisionsapp.viewmodels.DivisionViewModel

class DivisionFragment : Fragment(), DivisionAdapter.ItemClickListener {
    private lateinit var binding: FragmentDivisionListBinding
    private lateinit var divisionAdapter: DivisionAdapter
    private lateinit var viewModel: DivisionViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDivisionListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.divisionRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        DivisionAdapter.listener = this
        viewModel = DivisionViewModel(DivisionRepository())
        viewModel.getDivision()
        viewModel.items.observe(viewLifecycleOwner) {
            it?.let {
                divisionAdapter = DivisionAdapter(it)
                recyclerView.adapter = divisionAdapter
            }
        }

    }


    override fun onItemClick(division: DivisionResponseItem) {
            val action = DivisionFragmentDirections.actionDivisionFragmentToDistrictFragment(division)
            findNavController().navigate(action)

    }


}