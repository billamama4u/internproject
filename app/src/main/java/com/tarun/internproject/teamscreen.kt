package com.tarun.internproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tarun.internproject.databinding.FragmentTeamscreenBinding

class teamscreen : Fragment() {

    private lateinit var binding: FragmentTeamscreenBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TeamAdapter
    private lateinit var teamList: List<Team>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTeamscreenBinding.inflate(inflater, container, false)

        // Initialize RecyclerView and Adapter
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Create sample data
        teamList = listOf(
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
            Team("Manchester United", "England", R.drawable.eng, R.drawable.favorite),
        )

        binding.btn.setOnClickListener {
            findNavController().navigate(R.id.action_teamscreen_to_country)
        }

        adapter = TeamAdapter(teamList)
        recyclerView.adapter = adapter

        return binding.root
    }
}
