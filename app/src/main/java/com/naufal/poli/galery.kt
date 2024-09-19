package com.naufal.poli

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.naufal.poli.adapter.GalleryAdapter

class galery : AppCompatActivity() {
    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.mi,
        R.drawable.logo,
        R.drawable.ti,
        R.drawable.rpl,
        R.drawable.tk
    )

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = GalleryAdapter(this, imageList)
        gridView.adapter = adapter

            // Set up onClickListener for grid items
            gridView.setOnItemClickListener { _, _, position, _ ->
                val intent = Intent(this, photodeatil::class.java)
                intent.putExtra(
                    "imageResId",
                    imageList[position]
                ) // Pass the selected image ID to detail activity
                startActivity(intent)
            }
        }
    }
