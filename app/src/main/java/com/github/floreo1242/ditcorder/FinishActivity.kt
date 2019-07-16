package com.github.floreo1242.ditcorder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val game = intent.getStringExtra("game")
        val time = intent.getStringExtra("time")
        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")

        when (game) {
            "lol" -> gameTextView.text = "리그오브레전드"
            "tekken" -> gameTextView.text = "철권"
            "fifa" -> gameTextView.text = "피파"
            "pubg" -> gameTextView.text = "배틀그라운드"
        }

        when (time) {
            "15m" -> timeTextView.text = "15분"
            "30m" -> timeTextView.text = "30분"
            "1g" -> timeTextView.text = "1판"
            "2g" -> timeTextView.text = "2판"
        }

        nameTextView.setText(name)
        phoneTextView.setText(phone)

        toFirstButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }
    }
}
