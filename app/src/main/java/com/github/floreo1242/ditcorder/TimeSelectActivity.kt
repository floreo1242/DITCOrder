package com.github.floreo1242.ditcorder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_time_select.*
import org.jetbrains.anko.startActivity

class TimeSelectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_select)

        val game = intent.getStringExtra("game")

        m15ImageView.setOnClickListener {
            startActivity<InformationActivity>(
                "game" to game,
                "time" to "15m"
            )
        }
        m30ImageView.setOnClickListener {
            startActivity<InformationActivity>(
                "game" to game,
                "time" to "30m"
            )
        }
        game1ImageView.setOnClickListener {
            startActivity<InformationActivity>(
                "game" to game,
                "time" to "1g"
            )
        }
        game2ImageView.setOnClickListener {
            startActivity<InformationActivity>(
                "game" to game,
                "time" to "2g"
            )
        }
    }
}
