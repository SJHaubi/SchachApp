package de.mstransgermany.schachapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class loadingscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loadingscreen)

        val sod = Random.nextInt(until = 2)
        val ladeZeit: Long = 500


        if (sod < 1) {


            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, ladeZeit)
        } else {


            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, SoloscheckersSobenWuntenActivity::class.java)
                startActivity(intent)
                finish()
            }, ladeZeit)
        }
    }
}