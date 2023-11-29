package com.justmovies.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.justmovies.activities.DashboardActivity
import com.justmovies.databinding.ItemrecyclerviewBinding
import com.justmovies.fragments.MovieDetailFragment

class SaveAdapter (var context: Context): RecyclerView.Adapter<SaveAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: ItemrecyclerviewBinding): RecyclerView.ViewHolder(binding.root){

        init {
            binding.root.setOnClickListener {


                (context as DashboardActivity).loadFragment(MovieDetailFragment())

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SaveAdapter.ViewHolder {
        return ViewHolder(ItemrecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return 20
    }
}