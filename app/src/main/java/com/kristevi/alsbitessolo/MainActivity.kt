package com.kristevi.alsbitessolo

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // inisialisasi
    lateinit var paketjumat : LinearLayout
    lateinit var makanan : LinearLayout
    lateinit var minuman : LinearLayout
    lateinit var testimoni : LinearLayout
    lateinit var tvabout : TextView
    lateinit var tvkontak : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val paketjumat: LinearLayout = findViewById(R.id.paketjumat)
        paketjumat.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, PaketJumatActivity::class.java)
            startActivity(intent)
        }
        val makanan: LinearLayout = findViewById(R.id.makanan)
        makanan.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, MakananActivity::class.java)
            startActivity(intent)
        }
        val minuman: LinearLayout = findViewById(R.id.minuman)
        minuman.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, MinumanActivity::class.java)
            startActivity(intent)
        }
        val testimoni: LinearLayout = findViewById(R.id.testimoni)
        testimoni.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, TestimoniActivity::class.java)
            startActivity(intent)
        }
        val tvabout: TextView = findViewById(R.id.tvabout)
        tvabout.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, TentangActivity::class.java)
            startActivity(intent)
        }
        val tvkontak: TextView = findViewById(R.id.tvkontak)
        tvkontak.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, KontakActivity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
        fun init() {
            paketjumat = findViewById(R.id.paketjumat)
            makanan = findViewById(R.id.makanan)
            minuman = findViewById(R.id.minuman)
            testimoni = findViewById(R.id.testimoni)
            tvabout = findViewById(R.id.tvabout)
            tvkontak = findViewById(R.id.tvkontak)
        }
}