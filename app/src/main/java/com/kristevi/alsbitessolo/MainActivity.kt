package com.kristevi.alsbitessolo

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // inisialisasi
    lateinit var card1 : CardView
    lateinit var card2 : CardView
    lateinit var card3 : CardView
    lateinit var card4 : CardView
    lateinit var tvabout : TextView
    lateinit var tvkontak : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val card1: CardView = findViewById(R.id.card1)
        card1.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, PaketJumatActivity::class.java)
            startActivity(intent)
        }
        val card2: CardView = findViewById(R.id.card2)
        card2.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, MakananActivity::class.java)
            startActivity(intent)
        }
        val card3: CardView = findViewById(R.id.card3)
        card3.setOnClickListener {
            // membuat  intent untuk memulai activity kedua
            val intent = Intent(this, MinumanActivity::class.java)
            startActivity(intent)
        }
        val card4: CardView = findViewById(R.id.card4)
        card4.setOnClickListener {
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
            card1 = findViewById(R.id.card1)
            card2 = findViewById(R.id.card2)
            card3 = findViewById(R.id.card3)
            card4 = findViewById(R.id.card4)
            tvabout = findViewById(R.id.tvabout)
            tvkontak = findViewById(R.id.tvkontak)
        }
}