package com.justmovies.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.justmovies.R
import com.justmovies.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        listner()
    }

    private fun listner() {
        binding.continueBt.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.continueBt ->startActivity(Intent(this,ResetPasswordActivity::class.java))
        }
    }
}