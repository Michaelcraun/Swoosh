package com.craunicproductions.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.craunicproductions.swoosh.Model.Player
import com.craunicproductions.swoosh.R
import com.craunicproductions.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClicked(view: View) {
        ballerToggle.isChecked = false

        player.skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerToggle.isChecked = false

        player.skill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (beginnerToggle.isChecked || ballerToggle.isChecked) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
