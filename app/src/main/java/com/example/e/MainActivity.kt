package com.example.e

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var liczba1 = 0
        var liczba2 = 0
        var suma = 0
        findViewById<Button>(R.id.Wys).setOnClickListener {
            findViewById<TextView>(R.id.wyswietla).text = findViewById<TextInputEditText>(R.id.poletekstowe).text

        }




        findViewById<Button>(R.id.dodaj).setOnClickListener{
            findViewById<TextView>(R.id.wyswietla).text =
                findViewById<TextView>(R.id.wyswietla).text.toString() + findViewById<TextInputEditText>(R.id.poletekstowe).text.toString()

        }

        findViewById<Button>(R.id.suma).setOnClickListener {
            liczba1 = findViewById<TextInputEditText>(R.id.l1).text.toString().toInt()

            liczba2 = findViewById<TextInputEditText>(R.id.l2).text.toString().toInt()
            suma = liczba1 + liczba2
            findViewById<TextView>(R.id.Wys).text = liczba1.toString()+ "+" + suma.toString()
        }
    }
}