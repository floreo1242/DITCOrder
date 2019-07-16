package com.github.floreo1242.ditcorder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_information.*
import org.jetbrains.anko.startActivity

class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        val game = intent.getStringExtra("game")
        val time = intent.getStringExtra("time")

        completeButton.setOnClickListener {
            startActivity<FinishActivity>(
                "game" to game,
                "time" to time,
                "name" to nameEditText.text.toString(),
                "phone" to phoneEditText.text.toString()
            )
        }
    }
}
