package com.example.questron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Reponse1 = findViewById<Button>(R.id.RéponseA)
        val Reponse2 = findViewById<Button>(R.id.RéponseB)
        val Reponse3 = findViewById<Button>(R.id.RéponseC)
        val Reponse4 = findViewById<Button>(R.id.RéponseD)
        var Resultat = findViewById<TextView>(R.id.Résultat)
        val masecondequestion  =  Intent(this,MainActivity2::class.java)

        Reponse1.setOnClickListener{
            Toast.makeText(this,
                "Bonne Réponse", Toast.LENGTH_SHORT).show()
            startActivity(masecondequestion)
            }
        Reponse2.setOnClickListener{
            Toast.makeText(this,
                "Mauvaise Réponse", Toast.LENGTH_SHORT).show()
            startActivity(masecondequestion)
            }
        Reponse3.setOnClickListener{
            Toast.makeText(this,
                "Mauvaise Réponse", Toast.LENGTH_SHORT).show()
            startActivity(masecondequestion)
        }
        Reponse4.setOnClickListener{
            Toast.makeText(this,
                "Mauvaise Réponse", Toast.LENGTH_SHORT).show()
            startActivity(masecondequestion)
            }
        }
    }


