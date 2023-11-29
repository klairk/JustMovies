package com.justmovies.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.justmovies.R
import com.justmovies.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        listner()

    }

    private fun listner() {
        binding.continueBt.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.continueBt -> startActivity(Intent(this,DashboardActivity::class.java))
        }
    }
}