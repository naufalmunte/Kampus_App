package com.naufal.poli

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnFoto : Button
    private lateinit var btnMi : Button
    private lateinit var btnTk : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMi = findViewById(R.id.btnMi)
        btnTk = findViewById(R.id.btnTk)
        btnFoto = findViewById(R.id.btnFoto)

        btnMi.setOnClickListener(){
            val intent = Intent(this, manajemenInfo::class.java)
            startActivity(intent)
        }
        btnTk.setOnClickListener(){
            val intent = Intent(this, tekom::class.java)
            startActivity(intent)
        }
        btnFoto.setOnClickListener(){
            val intent = Intent(this, galery::class.java)
            startActivity(intent)
        }


    }
}