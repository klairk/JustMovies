package com.justmovies.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.justmovies.R
import com.justmovies.databinding.ActivityDashboardBinding
import com.justmovies.fragments.DashboardFragment

class DashboardActivity : AppCompatActivity() {

    lateinit var binding : ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(DashboardFragment())

    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount > 0)
            supportFragmentManager.popBackStackImmediate()
        else super.onBackPressed()
    }

    fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment)
            .addToBackStack("").commit()
    }
}