package com.justmovies.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.justmovies.R
import com.justmovies.activities.DashboardActivity
import com.justmovies.adapters.MainAdapter
import com.justmovies.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment(), View.OnClickListener {

    lateinit var binding : FragmentDashboardBinding


    var mainAdapter : MainAdapter?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentDashboardBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.dashboardRV.layoutManager = GridLayoutManager(requireActivity(), 2)
        mainAdapter = MainAdapter(requireActivity())
        binding.dashboardRV.adapter = mainAdapter

        listner()
    }

    private fun listner() {
        binding.profileIV.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.profileIV -> (requireActivity() as DashboardActivity).loadFragment(ProfileFragment())
        }
    }


}