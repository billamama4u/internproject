package com.tarun.internproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeamAdapter(private val teamList: List<Team>) : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    class TeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val flagImage: ImageView = itemView.findViewById(R.id.flagImage)
        val countryName: TextView = itemView.findViewById(R.id.countryName)
        val starIcon: ImageView = itemView.findViewById(R.id.starIcon)
        val country: TextView = itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.teamview, parent, false)
        return TeamViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val currentTeam = teamList[position]
        holder.countryName.text = currentTeam.countryName
        holder.flagImage.setImageResource(currentTeam.flagImageRes)
        holder.starIcon.setImageResource(currentTeam.starIconRes)
        holder.country.text = currentTeam.country
    }

    override fun getItemCount() = teamList.size
}
