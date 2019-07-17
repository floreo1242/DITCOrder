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

        op1ImageView.setOnClickListener {
            startActivity<InformationActivity>(
                "game" to game,
                "time" to "op1"
            )
        }
        op2ImageView.setOnClickListener {
            startActivity<InformationActivity>(
                "game" to game,
                "time" to "op2"
            )
        }
        op3ImageView.setOnClickListener {
            startActivity<InformationActivity>(
                "game" to game,
                "time" to "op3"
            )
        }
        op4ImageView.setOnClickListener {
            startActivity<InformationActivity>(
                "game" to game,
                "time" to "op4"
            )
        }
    }

    override fun onBackPressed() {
//        super.onBackPressed()
    }
}
