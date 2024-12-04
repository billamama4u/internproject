package com.tarun.internproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(private val countryList: List<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val flagImage: ImageView = itemView.findViewById(R.id.flagImage)
        val countryName: TextView = itemView.findViewById(R.id.countryName)
        val starIcon: ImageView = itemView.findViewById(R.id.starIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.countryview, parent, false)
        return CountryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentCountry = countryList[position]
        holder.countryName.text = currentCountry.name
        holder.flagImage.setImageResource(currentCountry.flagImageRes)

        // You can implement a click listener or update the star icon state here if needed
        // holder.starIcon.setOnClickListener { ... }
    }

    override fun getItemCount() = countryList.size
}
