package com.craunicproductions.swoosh.Controller

import android.os.Bundle
import com.craunicproductions.swoosh.Model.Player
import com.craunicproductions.swoosh.R
import com.craunicproductions.swoosh.Utilities.BaseActivity
import com.craunicproductions.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
