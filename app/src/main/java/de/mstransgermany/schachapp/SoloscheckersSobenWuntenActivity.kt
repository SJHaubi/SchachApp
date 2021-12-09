package de.mstransgermany.schachapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_doppelscheckers.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.button_reset
import kotlinx.android.synthetic.main.activity_main.feld_1
import kotlinx.android.synthetic.main.activity_main.feld_2
import kotlinx.android.synthetic.main.activity_main.imageButton2
import kotlin.random.Random

class SoloscheckersSobenWuntenActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var shared: SharedPreferences
    private var textColorYellow = false
    private var textColorPurple = false
    private var textColorRed = false
    private var textColorBlue = false
    private var textDisplaytime = false
    private var ladeZeit:Long  = 5000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.soloscheckers_soben_wunten)

        shared = this.getSharedPreferences("SharedPreferences", MODE_PRIVATE)

        feld_1.setOnClickListener { view ->
            onClick(view)
        }

        feld_2.setOnClickListener { view ->
            onClick_2(view)
        }
        button_reset.setOnClickListener { view ->
            onClick_3(view)
        }
        textColorYellow = shared.getBoolean("ColorTextYellow",false)
        textColorPurple = shared.getBoolean("ColorTextPurple",false)
        textColorRed = shared.getBoolean("ColorTextRed",false)
        textColorBlue = shared.getBoolean("ColorTextBlue",false)
        textDisplaytime = shared.getBoolean("switch_displaytime_state",false)
        checkTextColor()

    }


    private val spieler_1 = Random.nextInt(25)
    private val spieler_2 = Random.nextInt(25)

    private fun checkDisplaytime() {
        if(textDisplaytime){
            ladeZeit = 3000
        }
    }

    private fun checkTextColor(){
        if (textColorYellow){

            feld_1.setTextColor(getColor(R.color.colortextyellow))
            feld_2.setTextColor(getColor(R.color.colortextyellow))
            button_reset.setColorFilter(getColor(R.color.colortextyellow))
            imageButton2.setColorFilter(getColor(R.color.colortextyellow))

        } else if(textColorPurple) {
            feld_1.setTextColor(getColor(R.color.colortextpurple))
            feld_2.setTextColor(getColor(R.color.colortextpurple))
            button_reset.setColorFilter(getColor(R.color.colortextpurple))
            imageButton2.setColorFilter(getColor(R.color.colortextpurple))
        }else if(textColorRed) {
            feld_1.setTextColor(getColor(R.color.colortextred))
            feld_2.setTextColor(getColor(R.color.colortextred))
            button_reset.setColorFilter(getColor(R.color.colortextred))
            imageButton2.setColorFilter(getColor(R.color.colortextred))
        }else {
            feld_1.setTextColor(getColor(R.color.textColor))
            feld_2.setTextColor(getColor(R.color.textColor))
            button_reset.setColorFilter(getColor(R.color.textColor))
            imageButton2.setColorFilter(getColor(R.color.textColor))
        }
    }


    private fun feld1change() {
        Handler(Looper.getMainLooper()).postDelayed({
            feld_1.text = getString(R.string.Main_Button_1)
        }, ladeZeit)
    }

    private fun feld2change() {
        Handler(Looper.getMainLooper()).postDelayed({
            feld_2.text = getString(R.string.Main_Button_2)
        }, ladeZeit)
    }





    override fun onClick(v: View) {


        if (spieler_1 <= 1) {

            feld_1.text = getString(R.string.Bmbs)
            feld1change()


        } else if (spieler_1 <= 3) {

            feld_1.text = getString(R.string.DZmdFw)
            feld1change()


        } else if (spieler_1 <= 4) {

            feld_1.text = getString(R.string.WbSg)
            feld1change()


        } else if (spieler_1 <= 8) {

            feld_1.text = getString(R.string.HPPP)
            feld1change()


        } else if (spieler_1 <= 11) {

            feld_1.text = getString(R.string.DhZt)
            feld1change()

        } else if (spieler_1 <= 14) {

            feld_1.text = getString(R.string.KotH)
            feld1change()


        } else if (spieler_1 <= 15) {

            feld_1.text = getString(R.string.DmS)
            feld1change()


        } else if (spieler_1 <= 19) {

            feld_1.text = getString(R.string.Fidwss)
            feld1change()


        } else if (spieler_1 <= 23) {

            feld_1.text = getString(R.string.KuDdnr)
            feld1change()


        } else {

            feld_1.text = getString(R.string.nS)
            feld1change()


        }

        feld_2.setOnClickListener { view ->
            onClick_2(view)
        }
    }

    private fun onClick_2(v: View) {


        if (spieler_2 <= 1) {

            feld_2.text = getString(R.string.Bmbs)
            feld2change()


        } else if (spieler_2 <= 3) {

            feld_2.text = getString(R.string.DZmdFw)
            feld2change()


        } else if (spieler_2 <= 4) {

            feld_2.text = getString(R.string.WbSg)
            feld2change()


        } else if (spieler_2 <= 8) {

            feld_2.text = getString(R.string.HPPP)
            feld2change()


        } else if (spieler_2 <= 11) {

            feld_2.text = getString(R.string.DhZt)
            feld2change()

        } else if (spieler_2 <= 14) {

            feld_2.text = getString(R.string.KotH)
            feld2change()


        } else if (spieler_2 <= 15) {
            feld_2.text = getString(R.string.DmS)
            feld2change()

        } else if (spieler_2 <= 19) {
            feld_2.text = getString(R.string.Fidwss)
            feld2change()

        } else if (spieler_2 <= 23) {
            feld_2.text = getString(R.string.KuDdnr)
            feld2change()

        } else {
            feld_2.text = getString(R.string.nS)
            feld2change()


        }
    }

    fun onClick_3(context: View) {
        startActivity(Intent(this, loadingscreen::class.java))
        finish()
    }

    fun onClick_4(context: View) {
        startActivity(Intent(this, infomodesdialoge::class.java))

    }
}