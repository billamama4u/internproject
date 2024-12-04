package com.tarun.internproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tarun.internproject.databinding.ActivityMainBinding
import com.tarun.internproject.databinding.FragmentGetstartedBinding


class getstarted : Fragment() {

    lateinit var binding: FragmentGetstartedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentGetstartedBinding.inflate(layoutInflater)

        binding.textInputLayout.setOnClickListener{
            findNavController().navigate(R.id.action_getstarted_to_teamscreen)
        }
        binding.inp.setOnClickListener{
            findNavController().navigate(R.id.action_getstarted_to_teamscreen)
        }

        return binding.root
    }


}