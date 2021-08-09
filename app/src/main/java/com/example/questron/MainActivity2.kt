package com.example.questron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Reponse5 = findViewById<Button>(R.id.RéponseE)
        val Reponse6 = findViewById<Button>(R.id.RéponseF)
        val Reponse7 = findViewById<Button>(R.id.RéponseG)
        val Reponse8 = findViewById<Button>(R.id.RéponseH)
        var Resultat2 = findViewById<TextView>(R.id.Résultat2)
        val relance =  Intent(this,MainActivity::class.java)

        Reponse5.setOnClickListener{
            Toast.makeText(this,
                "Bonne Réponse", Toast.LENGTH_SHORT).show()
            startActivity(relance)
        }
        Reponse6.setOnClickListener{
            Toast.makeText(this,
                "Faux", Toast.LENGTH_SHORT).show()
            startActivity(relance)
        }
        Reponse7.setOnClickListener{
            Toast.makeText(this,
                "Faux", Toast.LENGTH_SHORT).show()
            startActivity(relance)
        }
        Reponse8.setOnClickListener{
            Toast.makeText(this,
                "Faux", Toast.LENGTH_SHORT).show()
            startActivity(relance)
        }

        val compteurreponses = findViewById<TextView>(R.id.compteur)
        var compteur = 1
        //btIncrement.setOnClickListener{
        //compteur += 1
        compteurreponses.text = compteur.toString()
    }
}