package com.tarun.internproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tarun.internproject.databinding.FragmentCountryBinding

class country : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var countryAdapter: CountryAdapter
    private lateinit var countryList: List<Country>
    private lateinit var binding: FragmentCountryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryBinding.inflate(layoutInflater)

        recyclerView = binding.recyclerView

        countryList = listOf(
            Country("India", R.drawable.ind),
            Country("India", R.drawable.ind),
            Country("India", R.drawable.ind),
            Country("India", R.drawable.ind),
            Country("India", R.drawable.ind),
            Country("India", R.drawable.ind),
            Country("India", R.drawable.ind),


        )

        countryAdapter = CountryAdapter(countryList)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = countryAdapter


        return binding.root
    }


}