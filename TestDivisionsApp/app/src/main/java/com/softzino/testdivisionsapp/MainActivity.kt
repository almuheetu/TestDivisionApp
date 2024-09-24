package com.softzino.testdivisionsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.softzino.testdivisionsapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        if (savedInstanceState == null) {
//            val divisionFragment = DivisionFragment()
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.district_fragment_container, divisionFragment)
//                .commit()
//        }

//        viewModel = DivisionViewModel(DivisionRepository())
//        viewModel.getDivision()

//        viewModel.items.observe(this) {
//            it?.let {
//                Log.d("Log404", "Division Response Item : ${it.toString()}")
//            }
//        }
    }
}