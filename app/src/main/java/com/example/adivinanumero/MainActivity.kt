package com.example.adivinanumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

lateinit var bt : Button
lateinit var bt2 : Button
lateinit var mom: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt = findViewById(R.id.btnBoton)
        bt2=findViewById((R.id.btnComprobar))
        mom=findViewById(R.id.txtMasOMenos)
        bt.setOnClickListener {

        }
        bt2.setOnClickListener {

        }

    }
}