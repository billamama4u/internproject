package com.tarun.internproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.launch


class splashscreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_splashscreen, container, false)

        Handler(Looper.getMainLooper()).postDelayed({
            lifecycleScope.launch {

                        findNavController().navigate(R.id.action_splashscreen_to_getstarted)

            }
        }, 3000L)

        return view
    }


}