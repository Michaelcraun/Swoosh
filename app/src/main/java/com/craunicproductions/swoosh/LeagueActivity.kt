package com.craunicproductions.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View) {
        womensToggle.isChecked = false
        coEdToggle.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        mensToggle.isChecked = false
        coEdToggle.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {
        mensToggle.isChecked = false
        womensToggle.isChecked = false

        selectedLeague = "coed"
    }
}
