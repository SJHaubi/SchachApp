package de.mstransgermany.schachapp


import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.doppelscheckers_swwo.*
import kotlin.random.Random

class doppelscheckers_swwo : AppCompatActivity() {

    private lateinit var shared: SharedPreferences
    private var textColorYellow = false
    private var textColorPurple = false
    private var textColorRed = false
    private var textColorBlue = false
    private var textDisplaytime = false
    private var ladeZeit:Long  = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doppelscheckers_swwo)

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
        textColorYellow = shared.getBoolean("ColorTextYellow", false)
        textColorPurple = shared.getBoolean("ColorTextPurple", false)
        textColorRed = shared.getBoolean("ColorTextRed", false)
        textColorBlue = shared.getBoolean("ColorTextBlue", false)
        textDisplaytime = shared.getBoolean("switch_displaytime_state",false)
        checkTextColor()
    }

    private val spieler_1 = Random.nextInt(185)
    private val spieler_2 = Random.nextInt(185)
    private val sw = Random.nextInt(2)

    private fun checkTextColor() {
        if (textColorYellow) {

            feld_1.setTextColor(getColor(R.color.colortextyellow))
            feld_2.setTextColor(getColor(R.color.colortextyellow))
            button_reset.setColorFilter(getColor(R.color.colortextyellow))
            imageButton2.setColorFilter(getColor(R.color.colortextyellow))

        } else if (textColorPurple) {
            feld_1.setTextColor(getColor(R.color.colortextpurple))
            feld_2.setTextColor(getColor(R.color.colortextpurple))
            button_reset.setColorFilter(getColor(R.color.colortextpurple))
            imageButton2.setColorFilter(getColor(R.color.colortextpurple))
        } else if (textColorRed) {
            feld_1.setTextColor(getColor(R.color.colortextred))
            feld_2.setTextColor(getColor(R.color.colortextred))
            button_reset.setColorFilter(getColor(R.color.colortextred))
            imageButton2.setColorFilter(getColor(R.color.colortextred))
        } else {
            feld_1.setTextColor(getColor(R.color.textColor))
            feld_2.setTextColor(getColor(R.color.textColor))
            button_reset.setColorFilter(getColor(R.color.textColor))
            imageButton2.setColorFilter(getColor(R.color.textColor))
        }
    }
    private fun checkDisplaytime() {
        if(textDisplaytime){
            ladeZeit = 3000
        }
    }



    private fun feld1change() {
        Handler(Looper.getMainLooper()).postDelayed({
            feld_1.text = getString(R.string.Main_Button_1)

            button_reset.visibility = View.VISIBLE
        }, ladeZeit)
    }

    private fun feld2change() {
        Handler(Looper.getMainLooper()).postDelayed({
            feld_2.text = getString(R.string.Main_Button_2)
            weis_unten.visibility = View.VISIBLE
        }, ladeZeit)
    }

    private fun viewobenchange() {
        schwarz_oben.visibility = View.GONE

    }

    private fun viewuntenchange() {
        weis_unten.visibility = View.GONE
    }

    fun onClick_3(context: View) {
        if (sw < 1) {
            startActivity(Intent(this, doppelscheckers_swwo::class.java))
            finish()
        } else {
            startActivity(Intent(this, Doppelscheckers::class.java))
            finish()
        }
    }

    private fun onClick(v: View) {


        if (spieler_1 <= 2) {


            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

            /*Toast.makeText(
                    this,
                    "Weiß \n" + "\n" +
                            getString(R.string.Bmbs) + "\n" + "und \n" + "\n" + getString(R.string.DZmdFw),
                    Toast.LENGTH_LONG
                ).show()*/
        } else if (spieler_1 <= 4) {
            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 6) {
            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 8) {
            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 10) {
            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 12) {
            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 14) {
            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 16) {
            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 18) {
            feld_1.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 20) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 22) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 24) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 26) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 28) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 30) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 32) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 34) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 36) {
            feld_1.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 37) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 38) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 39) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 40) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 41) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 42) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 43) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 44) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 45) {
            feld_1.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 48) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 51) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 52) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 55) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 58) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 61) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 64) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 67) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 70) {
            feld_1.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 73) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 76) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 79) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 82) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 85) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 88) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 91) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 94) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 97) {
            feld_1.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 100) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 103) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 106) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 109) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 112) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 115) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 118) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 121) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 124) {
            feld_1.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 126) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 128) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 130) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 126) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 128) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 130) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 132) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 134) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 136) {
            feld_1.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 138) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 140) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 142) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 144) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 146) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 148) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 150) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 152) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 154) {
            feld_1.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 156) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 158) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 160) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 162) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 164) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 166) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 168) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 170) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 172) {
            feld_1.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 173) {
            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 174) {
            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 175) {
            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 176) {
            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 177) {
            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 178) {

            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 179) {
            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 180) {
            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 181) {
            feld_1.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld1change(); viewobenchange()

        } else if (spieler_1 <= 183) {

            //Hier sind alle Spielweisen die sich verstärken bei doppeltem
            feld_1.text =
                getString(R.string.dopDhZt)
            feld1change(); viewobenchange()

        } else {
            feld_1.text =
                getString(R.string.dopDmS)
            feld1change(); viewobenchange()

        }


    }

    private fun onClick_2(v: View) {


        if (spieler_2 <= 2) {


            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()
            /*Toast.makeText(
                    this,
                    "Weiß \n" + "\n" +
                            getString(R.string.Bmbs) + "\n" + "und \n" + "\n" + getString(R.string.DZmdFw),
                    Toast.LENGTH_LONG
                ).show()*/
        } else if (spieler_2 <= 4) {
            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 6) {
            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 8) {
            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 10) {
            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 12) {
            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 14) {
            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 16) {
            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 18) {
            feld_2.text =
                getString(R.string.Bmbs) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 20) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 22) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 24) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 26) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 28) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 30) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 32) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 34) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 36) {
            feld_2.text =
                getString(R.string.DZmdFw) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 37) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 38) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 39) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 40) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 41) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 42) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 43) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 44) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 45) {
            feld_2.text =
                getString(R.string.WbSg) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 48) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 51) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 52) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 55) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 58) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 61) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 64) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 67) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 70) {
            feld_2.text =
                getString(R.string.HPPP) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 73) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 76) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 79) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 82) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 85) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 88) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 91) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 94) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 97) {
            feld_2.text =
                getString(R.string.DhZt) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 100) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 103) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 106) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 109) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 112) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 115) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 118) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 121) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 124) {
            feld_2.text =
                getString(R.string.KotH) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 126) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 128) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 130) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 126) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 128) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 130) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 132) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 134) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 136) {
            feld_2.text =
                getString(R.string.DmS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 138) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 140) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 142) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 144) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 146) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 148) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 150) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 152) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 154) {
            feld_2.text =
                getString(R.string.Fidwss) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 156) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 158) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 160) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 162) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 164) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 166) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 168) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 170) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 172) {
            feld_2.text =
                getString(R.string.KuDdnr) + "\n" + getString(R.string.und) + "\n" + getString(R.string.nS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 173) {
            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Bmbs)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 174) {
            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DZmdFw)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 175) {
            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.WbSg)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 176) {
            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.HPPP)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 177) {
            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DhZt)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 178) {

            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KotH)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 179) {
            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.DmS)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 180) {
            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.Fidwss)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 181) {
            feld_2.text =
                getString(R.string.nS) + "\n" + getString(R.string.und) + "\n" + getString(R.string.KuDdnr)
            feld2change(); viewuntenchange()

        } else if (spieler_2 <= 183) {

            //Hier sind alle Spielweisen die sich verstärken bei doppeltem
            feld_2.text =
                getString(R.string.dopDhZt)
            feld2change(); viewuntenchange()

        } else {
            feld_2.text =
                getString(R.string.dopDmS)
            feld2change(); viewuntenchange()

        }


    }

    fun onClick_4(context: View) {
        startActivity(Intent(this, infomodesdialoge::class.java))

    }


}
