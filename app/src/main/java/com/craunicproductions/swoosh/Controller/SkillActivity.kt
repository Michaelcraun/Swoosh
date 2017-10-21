package com.craunicproductions.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.craunicproductions.swoosh.R
import com.craunicproductions.swoosh.Utilities.EXTRA_LEAGUE
import com.craunicproductions.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View) {
        ballerToggle.isChecked = false

        skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerToggle.isChecked = false

        skill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (beginnerToggle.isChecked || ballerToggle.isChecked) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
