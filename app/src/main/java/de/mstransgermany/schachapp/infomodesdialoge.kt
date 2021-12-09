package de.mstransgermany.schachapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class infomodesdialoge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.infomodesdialoge)

        this.setFinishOnTouchOutside(true)
    }
}