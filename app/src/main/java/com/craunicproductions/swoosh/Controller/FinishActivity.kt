package com.craunicproductions.swoosh.Controller

import android.os.Bundle
import com.craunicproductions.swoosh.R
import com.craunicproductions.swoosh.Utilities.BaseActivity
import com.craunicproductions.swoosh.Utilities.EXTRA_LEAGUE
import com.craunicproductions.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    var skill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        skill = intent.getStringExtra(EXTRA_SKILL)
        league = intent.getStringExtra(EXTRA_LEAGUE)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
