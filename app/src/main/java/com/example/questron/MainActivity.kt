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
                "Faux", Toast.LENGTH_SHORT).show()
            startActivity(masecondequestion)
            }
        Reponse3.setOnClickListener{
            Toast.makeText(this,
                "Faux", Toast.LENGTH_SHORT).show()
            startActivity(masecondequestion)
        }
        Reponse4.setOnClickListener{
            Toast.makeText(this,
                "Faux", Toast.LENGTH_SHORT).show()
            startActivity(masecondequestion)
            }


        val compteurreponses = findViewById<TextView>(R.id.compteur)
        var compteur = 1
        //btIncrement.setOnClickListener{
            //compteur += 1
        compteurreponses.text = compteur.toString()

        /*var compteur = 0
        fun Resultat(savedInstanceState: Bundle?) {
            setContentView(R.layout.activity_main)
            compteurreponses.setOnClickListener{
                compteur += 1
                compteurreponses.text = "compteur"
            }
        }
        fun onSaveInstanceState(outState: Bundle) {
            outState.putInt("compteur", compteur)
        }

        fun onRestoreInstanceState(savedInstanceState: Bundle) {
            compteur = savedInstanceState.getInt("compteur")
        }*/
    }
    }


