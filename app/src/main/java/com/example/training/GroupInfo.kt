package com.example.training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GroupInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_info)
        val buttonStudent1: Button = findViewById(R.id.buttonStudent1)


        buttonStudent1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,identityActivity::class.java)
            startActivity(newIntent)
        })
    }
}