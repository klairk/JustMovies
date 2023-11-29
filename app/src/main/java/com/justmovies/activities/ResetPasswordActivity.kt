package com.justmovies.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.justmovies.R
import com.justmovies.databinding.ActivityResetPasswordBinding

class ResetPasswordActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityResetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listner()

    }

    private fun listner() {
        binding.resetBT.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.resetBT -> startActivity(Intent(this,DashboardActivity::class.java))
        }
    }
}