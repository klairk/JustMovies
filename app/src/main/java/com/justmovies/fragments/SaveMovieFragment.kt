package com.justmovies.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.justmovies.R
import com.justmovies.adapters.SaveAdapter
import com.justmovies.databinding.FragmentSaveMovieBinding


class SaveMovieFragment : Fragment() {


    lateinit var binding :FragmentSaveMovieBinding

    var saveAdapter : SaveAdapter?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSaveMovieBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.saveRV.layoutManager = GridLayoutManager(requireActivity(), 2)
        saveAdapter = SaveAdapter(requireActivity())
        binding.saveRV.adapter = saveAdapter
    }

}