package com.justmovies.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.justmovies.R
import com.justmovies.activities.DashboardActivity
import com.justmovies.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        listner()
    }

    private fun listner() {
        binding.favoriateRL.setOnClickListener(this)
        binding.saveRL.setOnClickListener(this)
        binding.changePasswordRL.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.favoriateRL -> (requireActivity() as DashboardActivity).loadFragment(FavouriteFragment())
            R.id.saveRL -> (requireActivity() as DashboardActivity).loadFragment(SaveMovieFragment())
            R.id.changePasswordRL -> (requireActivity() as DashboardActivity).loadFragment(ChangePasswordFragment())
        }
    }


}