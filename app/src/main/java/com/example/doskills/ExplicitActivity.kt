package com.example.doskills

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.airbnb.lottie.LottieAnimationView

class ExplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        val animationView = findViewById<LottieAnimationView>(R.id.animation_view)
        val mobileAppWiget = findViewById<CardView>(R.id.mobileApp)
        val fullstack = findViewById<CardView>(R.id.fullstack)
        val uivariable = findViewById<CardView>(R.id.uiux)
        val socialmedia = findViewById<CardView>(R.id.socialmedia)


        mobileAppWiget.setOnClickListener {
            val intent = Intent(applicationContext, MobileAppActivity::class.java)
            startActivity(intent)
        }

        fullstack.setOnClickListener {
            val intent = Intent(applicationContext, FullStackDevelopmentActivity::class.java)
            startActivity(intent)
        }

        uivariable.setOnClickListener {
            val intent = Intent(applicationContext, UiActivity::class.java)
            startActivity(intent)
        }

        socialmedia.setOnClickListener {
            val intent = Intent(applicationContext, SocalMediaMarketingActivity::class.java)
            startActivity(intent)
        }

        animationView.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "923495457536")
            startActivity(intent)
        }

    }
}