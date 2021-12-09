package de.mstransgermany.schachapp

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_einstellungen.*


class Einstellungen : AppCompatActivity() {

    private lateinit var shared: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_einstellungen)

        shared = this.getSharedPreferences("SharedPreferences", MODE_PRIVATE)

        switch1.isChecked = shared.getBoolean("switch", false)
        switch2.isChecked = shared.getBoolean("switch_displaytime_state",false)




        switch1.setOnClickListener { view ->
            onClickSettingsSwitch1(view)
        }
        buttoncolortextblue.setOnClickListener { view ->
            onClickColorTextBlue(view)
        }

        buttoncolortextred.setOnClickListener { view ->
            onClickColorTextRed(view)
        }
        buttoncolortextpurple.setOnClickListener { view ->
            onClickColorTextPurple(view)
        }
        buttoncolortextyellow.setOnClickListener { view ->
            onClickColorTextYellow(view)
        }
        switch2.setOnClickListener { view ->
            onClickSettingsSwitch2(view)
        }


    }

    private fun onClickColorTextYellow(view: View?) {

        toastRestartScheckers()

        shared.edit().putBoolean("ColorTextYellow", true).apply()
        shared.edit().putBoolean("ColorTextPurple", false).apply()
        shared.edit().putBoolean("ColorTextRed", false).apply()
        shared.edit().putBoolean("ColorTextBlue", false).apply()

    }

    private fun onClickColorTextPurple(view: View?) {

        toastRestartScheckers()

        shared.edit().putBoolean("ColorTextYellow", false).apply()
        shared.edit().putBoolean("ColorTextPurple", true).apply()
        shared.edit().putBoolean("ColorTextRed", false).apply()
        shared.edit().putBoolean("ColorTextBlue", false).apply()

    }

    private fun onClickColorTextRed(view: View?) {

        toastRestartScheckers()

        shared.edit().putBoolean("ColorTextYellow", false).apply()
        shared.edit().putBoolean("ColorTextPurple", false).apply()
        shared.edit().putBoolean("ColorTextRed", true).apply()
        shared.edit().putBoolean("ColorTextBlue", false).apply()

    }

    private fun onClickColorTextBlue(view: View?) {

        toastRestartScheckers()

        shared.edit().putBoolean("ColorTextYellow", false).apply()
        shared.edit().putBoolean("ColorTextPurple", false).apply()
        shared.edit().putBoolean("ColorTextRed", false).apply()
        shared.edit().putBoolean("ColorTextBlue", true).apply()

    }

    private fun onClickSettingsSwitch1(view: View?) {
        val isChecked: Boolean = shared.getBoolean("switch", false)


        shared.edit().putBoolean("switch", !isChecked).apply()

    }
    private fun onClickSettingsSwitch2(view: View?) {
        val isChecked: Boolean = shared.getBoolean("switch_displaytime_state", false)


        shared.edit().putBoolean("switch_displaytime_state", !isChecked).apply()

    }

    private fun toastRestartScheckers() {
        Toast.makeText(
            this,
            getString(R.string.RestartAppSettings),
            Toast.LENGTH_SHORT
        ).show()
    }
}