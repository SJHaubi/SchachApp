package de.mstransgermany.schachapp


import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_haupt_menu.*


class haupt_menu : AppCompatActivity() {

    private lateinit var shared: SharedPreferences
    private var textColorYellow = false
    private var textColorPurple = false
    private var textColorRed = false
    private var textColorBlue = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haupt_menu)

        shared = this.getSharedPreferences("SharedPreferences", MODE_PRIVATE)

        textColorYellow = shared.getBoolean("ColorTextYellow", false)
        textColorPurple = shared.getBoolean("ColorTextPurple", false)
        textColorRed = shared.getBoolean("ColorTextRed", false)
        textColorBlue = shared.getBoolean("ColorTextBlue", false)
        checkTextColor()



        button3.setOnClickListener { view ->
            onClickHauptSolo(view)
        }
        doppelscheckershauptm.setOnClickListener { view ->
            onClickHauptDuo(view)
        }
        imageButton4.setOnClickListener { view ->
            onClickInfomodes(view)
        }
        einstellungen.setOnClickListener { view ->
            onClickeinstellungen(view)
        }
    }

    private fun checkTextColor() {
        if (textColorYellow) {

            doppelscheckershauptm.setTextColor(getColor(R.color.colortextyellow))
            button3.setTextColor(getColor(R.color.colortextyellow))
        } else if (textColorPurple) {
            doppelscheckershauptm.setTextColor(getColor(R.color.colortextpurple))
            button3.setTextColor(getColor(R.color.colortextpurple))
        } else if (textColorRed) {
            doppelscheckershauptm.setTextColor(getColor(R.color.colortextred))
            button3.setTextColor(getColor(R.color.colortextred))
        } else {
            doppelscheckershauptm.setTextColor(getColor(R.color.textColor))
            button3.setTextColor(getColor(R.color.textColor))
        }
    }

    private fun onClickHauptSolo(view: View) {
        startActivity(Intent(this, loadingscreen::class.java))
    }

    private fun onClickHauptDuo(view: View) {
        startActivity(Intent(this, Doppelscheckers::class.java))

    }

    fun onClickeinstellungen(view: View) {
        startActivity(Intent(this, Einstellungen::class.java))
    }

    fun onClickInfomodes(view: View) {
        startActivity(Intent(this, infomodes::class.java))
    }


}