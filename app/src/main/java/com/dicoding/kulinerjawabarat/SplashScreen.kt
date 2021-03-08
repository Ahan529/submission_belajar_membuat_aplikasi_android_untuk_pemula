package com.dicoding.kulinerjawabarat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val loading : ImageView = findViewById(R.id.loading)
        Glide.with(this)
            .load(R.drawable.loading)
            .into(loading)

        Handler().postDelayed({
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
        },4000)
    }
}