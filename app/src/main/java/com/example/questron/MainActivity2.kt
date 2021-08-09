package com.example.questron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

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
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Bonne réponse")
            builder.setMessage("Souhaitez-vous jouer de nouveau")
            builder.setPositiveButton("Oui") { dialog, which ->
                Reponse5.text = "Nouvelle partie"
                startActivity(relance)
            }
            builder.setNegativeButton("Non") { dialog, which ->
                Reponse5.text = "Merci à bientôt"
            }
            builder.show()
        }


        Reponse6.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Mauvaise réponse")
            builder.setMessage("Souhaitez-vous jouer de nouveau")
            builder.setPositiveButton("Oui") { dialog, which ->
                Reponse5.text = "Nouvelle partie"
                startActivity(relance)
            }
            builder.setNegativeButton("Non") { dialog, which ->
                Reponse5.text = "Merci à bientôt"
            }
            builder.show()
        }

        Reponse7.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Mauvaise réponse")
            builder.setMessage("Souhaitez-vous jouer de nouveau")
            builder.setPositiveButton("Oui") { dialog, which ->
                Reponse5.text = "Nouvelle partie"
                startActivity(relance)
            }
            builder.setNegativeButton("Non") { dialog, which ->
                Reponse5.text = "Merci à bientôt"
            }
            builder.show()
        }

        Reponse8.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Mauvaise réponse")
            builder.setMessage("Souhaitez-vous jouer de nouveau")
            builder.setPositiveButton("Oui") { dialog, which ->
                Reponse5.text = "Nouvelle partie"
                startActivity(relance)
            }
            builder.setNegativeButton("Non") { dialog, which ->
                Reponse5.text = "Merci à bientôt"
            }
            builder.show()
        }


        /* Creation de l'alerte
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Mon popup")
        builder.setMessage("Bienvenue sur ma première application")
        builder.setPositiveButton("Valider") { dialog, which ->
            tvMessage.text = "Popup validé"
        }
        builder.setNegativeButton("Refusé") { dialog, which ->
            tvMessage.text = "Popup refusé"
        }
        //builder.show()

        // Creation du Toast (petit message)
        Toast.makeText(this,
            "Pu de batterie", Toast.LENGTH_SHORT).show()*/

        val compteurreponses = findViewById<TextView>(R.id.compteur)
        var compteur = 2
        //btIncrement.setOnClickListener{
        //compteur += 1
        compteurreponses.text = compteur.toString()

       /* var compteur = 0
        fun onCreate(savedInstanceState: Bundle?) {
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


