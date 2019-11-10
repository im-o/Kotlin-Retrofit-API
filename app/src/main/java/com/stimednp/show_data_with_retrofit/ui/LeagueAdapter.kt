package com.stimednp.show_data_with_retrofit.ui

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.stimednp.show_data_with_retrofit.R
import com.stimednp.show_data_with_retrofit.api.Leagues
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

/**
 * Created by rivaldy on 11/10/2019.
 */

class LeagueAdapter(val items: List<Leagues>) :
    RecyclerView.Adapter<LeagueAdapter.LeagueViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueViewHolder {
        return LeagueViewHolder(
            ItemsLeagueUI().createView(
                AnkoContext.Companion.create(
                    parent.context,
                    parent
                )
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: LeagueViewHolder, position: Int) {
        holder.bindItem(items[position], position)
    }

    class LeagueViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val ligaName: TextView = view.find(R.id.tv_name)

        fun bindItem(leagues: Leagues, position: Int) {
            val text = "[$position] (id : ${leagues.idLeague}) --> ${leagues.strLeague}"
            ligaName.text = text
        }
    }

}