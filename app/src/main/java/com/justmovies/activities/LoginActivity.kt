package com.justmovies.activities

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.justmovies.R
import com.justmovies.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.spamTV.text = "Don’t have an account?"
        binding.spamTV.append(" ")
        span("Sign up", binding.spamTV)


        listner()
    }

    private fun listner() {
        binding.signUpBT.setOnClickListener(this)
        binding.forgetPasswordTV.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
       when(p0!!.id){
           R.id.signUpBT -> startActivity(Intent(this,DashboardActivity::class.java))
           R.id.forgetPasswordTV -> startActivity(Intent(this,ForgotPasswordActivity::class.java))
       }
    }


    private fun span(text: String, textView: TextView) {

        val span = Spannable.Factory.getInstance().newSpannable(text)
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.setHighlightColor(Color.TRANSPARENT);


        textView.setOnLongClickListener { false }

        val cs: ClickableSpan = object : ClickableSpan() {
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.color = ContextCompat.getColor(this@LoginActivity,R.color.violet)
                ds.isUnderlineText = false


            }
            override fun onClick(v: View) {
                startActivity(Intent(this@LoginActivity,RegisterActivity::class.java))
            }
        }
        span.setSpan(cs, 0, span.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.append(span)
    }
}