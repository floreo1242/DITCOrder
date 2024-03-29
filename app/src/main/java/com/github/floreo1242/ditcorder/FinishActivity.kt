package com.github.floreo1242.ditcorder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    private var orderVal: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val game = intent.getStringExtra("game")
        val time = intent.getStringExtra("time")

        when (game) {
            "game1" -> gameTextView.text = getString(R.string.game1)
            "game2" -> gameTextView.text = getString(R.string.game2)
            "game3" -> gameTextView.text = getString(R.string.game3)
            "game4" -> gameTextView.text = getString(R.string.game4)
        }

        when (time) {
            "op1" -> timeTextView.text = getString(R.string.option1)
            "op2" -> timeTextView.text = getString(R.string.option2)
            "op3" -> timeTextView.text = getString(R.string.option3)
            "op4" -> timeTextView.text = getString(R.string.option4)
        }

        nameTextView.text = intent.getStringExtra("name")
        phoneTextView.text = intent.getStringExtra("phone")

        loadData()
        orderVal++
        saveData(orderVal)

        orderTextView.text = String.format(getString(R.string.orderNumber), orderVal)

        toFirstButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
//        super.onBackPressed()
    }

    private fun saveData(order: Int) {
        val pref = getPreferences(0)
        val editor = pref.edit()

        editor.putInt("KEY_ORDER", order).apply()
    }

    private fun loadData() {
        val pref = getPreferences(0)
        val order = pref.getInt("KEY_ORDER", 0)
        orderVal = order
    }
}
