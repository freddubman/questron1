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
        val builder = AlertDialog.Builder(this)
            builder.setMessage("Souhaitez-vous jouer de nouveau ?")

        Reponse5.setOnClickListener{
            builder.setTitle("Bonne réponse")
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
            builder.setTitle("Mauvaise réponse")
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
            builder.setTitle("Mauvaise réponse")
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
            builder.setTitle("Mauvaise réponse")
            builder.setPositiveButton("Oui") { dialog, which ->
                Reponse5.text = "Nouvelle partie"
                startActivity(relance)
            }
            builder.setNegativeButton("Non") { dialog, which ->
                Reponse5.text = "Merci à bientôt"
            }
            builder.show()
        }

    }
}


