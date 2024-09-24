package com.softzino.testdivisionsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.softzino.testdivisionsapp.databinding.FragmentThanaListBinding
import com.softzino.testdivisionsapp.placeholder.PlaceholderContent
import com.softzino.testdivisionsapp.repositories.DivisionRepository
import com.softzino.testdivisionsapp.viewmodels.DivisionViewModel

class ThanaFragment : Fragment() {
    private lateinit var binding: FragmentThanaListBinding
    private lateinit var thanaAdapter: ThanaAdapter
    private lateinit var viewModel: DivisionViewModel
//    private val args: ThanaFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThanaListBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val district = args.data
//        val districtId = district.id


        val recyclerView: RecyclerView = binding.thanaRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel = DivisionViewModel(DivisionRepository())
        viewModel.getDivision()
        viewModel.items.observe(viewLifecycleOwner) {
            it?.let {
//                val filteredDistrict = it.find {
//                    district -> district.id == districtId
//                }
//                if (filteredDistrict != null) {
//                    thanaAdapter = ThanaAdapter(filteredDistrict)
//                    recyclerView.adapter = thanaAdapter
//                }
            }
        }


    }


}