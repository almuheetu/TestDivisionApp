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
import androidx.navigation.fragment.navArgs
import com.softzino.testdivisionsapp.databinding.FragmentDistrictListBinding
import com.softzino.testdivisionsapp.model.District
import com.softzino.testdivisionsapp.repositories.DivisionRepository
import com.softzino.testdivisionsapp.viewmodels.DivisionViewModel

class DistrictFragment : Fragment(), DistrictAdapter.ItemClickListener {
    private lateinit var binding: FragmentDistrictListBinding
    private lateinit var districtAdapter: DistrictAdapter
    private lateinit var viewModel: DivisionViewModel
    private val args: DistrictFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDistrictListBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val division = args.data
        val divisionId = division.id


        val recyclerView: RecyclerView = binding.districtRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        DistrictAdapter.listener = this

        viewModel = DivisionViewModel(DivisionRepository())
        viewModel.getDivision()
        Log.d("response", "onViewCreated: $divisionId")
        viewModel.items.observe(viewLifecycleOwner) {
            it?.let {
//                Log.d("response", "onViewCreated: ${it.toString()}")
//                val allDistrict = it
//                val filteredDistrict = allDistrict.filter { it.id == divisionId }
//                Log.d("Log404", "onViewCreated: ${filteredDistrict.toString()}")
//                districtAdapter = DistrictAdapter(filteredDistrict[0].districts)
//                recyclerView.adapter = districtAdapter
            }

        }
    }

    override fun onItemClick(district: District) {
//        val action = DistrictFragmentDirections.actionDistrictFragmentToThanaFragment(district)
//        findNavController().navigate(action)
    }

}



