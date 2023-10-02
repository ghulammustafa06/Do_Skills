package com.example.doskills


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTransfer = findViewById<Button>(R.id.btnIntent)


        btnTransfer.setOnClickListener {
            val intent = Intent(applicationContext, ExplicitActivity::class.java)
            startActivity(intent)
        }
    }
}
