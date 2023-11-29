package com.justmovies.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.justmovies.R
import com.justmovies.adapters.FavouriteAdapter
import com.justmovies.databinding.FragmentFavouriteBinding


class FavouriteFragment : Fragment() {

    lateinit var binding : FragmentFavouriteBinding

    var favouriteAdapter : FavouriteAdapter?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding = FragmentFavouriteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.favouriteRV.layoutManager = GridLayoutManager(requireActivity(), 2)
        favouriteAdapter = FavouriteAdapter(requireActivity())
        binding.favouriteRV.adapter = favouriteAdapter
    }
}