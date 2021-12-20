package com.example.training

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)

                setContentView(R.layout.activity_splash_screen)

//ici Logoview est l'id Imagewiew est le type et on le situe dans le dossier avec le findwiew
                var logoview : ImageView = findViewById(R.id.logoview)

                logoview.alpha = 1f
                logoview.animate().setDuration(2000).alpha(0f).withEndAction{
                    val i = Intent(this, MainActivity::class.java)
                    startActivity(i)
                    finish()
                }
            }
        }
