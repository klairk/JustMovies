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
import com.justmovies.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.spamTV.text = "Do have an account?"
        binding.spamTV.append(" ")
        span("Sign In", binding.spamTV)

        listner()
    }

    private fun span(text: String, textView: TextView) {

        val span = Spannable.Factory.getInstance().newSpannable(text)
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.setHighlightColor(Color.TRANSPARENT);


        textView.setOnLongClickListener { false }

        val cs: ClickableSpan = object : ClickableSpan() {
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.color = ContextCompat.getColor(this@RegisterActivity,R.color.violet)
                ds.isUnderlineText = false


            }
            override fun onClick(v: View) {
                startActivity(Intent(this@RegisterActivity,LoginActivity::class.java))
                finish()
            }
        }
        span.setSpan(cs, 0, span.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.append(span)
    }

    private fun listner() {
        binding.signUpBT.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.signUpBT -> startActivity(Intent(this,OtpActivity::class.java))
        }
    }
}