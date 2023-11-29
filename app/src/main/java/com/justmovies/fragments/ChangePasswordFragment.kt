package com.justmovies.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.justmovies.R
import com.justmovies.databinding.FragmentChangePasswordBinding


class ChangePasswordFragment : Fragment(), View.OnClickListener {

    lateinit var binding : FragmentChangePasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChangePasswordBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listner()
    }

    private fun listner() {
        binding.resetBT.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.resetBT -> Toast.makeText(getActivity(), "This is my Toast message!",
                Toast.LENGTH_LONG).show();
        }
    }
}