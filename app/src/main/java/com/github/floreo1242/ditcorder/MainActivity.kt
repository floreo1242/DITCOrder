package com.github.floreo1242.ditcorder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lolImageView.setOnClickListener {
            startActivity<TimeSelectActivity>(
                "game" to "game1"
            )
        }
        tekkenImageView.setOnClickListener {
            startActivity<TimeSelectActivity>(
                "game" to "game2"
            )
        }
        fifaImageView.setOnClickListener {
            startActivity<TimeSelectActivity>(
                "game" to "game3"
            )
        }
        pubgImageView.setOnClickListener {
            startActivity<TimeSelectActivity>(
                "game" to "game4"
            )
        }
    }

    override fun onBackPressed() {
//        super.onBackPressed()
    }
}
