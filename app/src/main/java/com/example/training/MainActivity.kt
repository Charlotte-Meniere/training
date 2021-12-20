package com.example.training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonIdentity: Button = findViewById(R.id.buttonIdentity)


        buttonIdentity.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,identityActivity::class.java)
            startActivity(newIntent)
        })
    }
}