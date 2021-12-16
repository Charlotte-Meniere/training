package com.example.training

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity {

        class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)

                setContentView(R.layout.activity_splash_screen)

                logoview.alpha = 0f
                logoview.animate().setDuration(1500).alpha(1f).withEndAction{
                    val i = Intent(this, MainActivity::class.java)
                    startActivity(i)
                    overridePendingTransition(android.R.anim.fade_out)
                    finish()
                }
            }
        }}
