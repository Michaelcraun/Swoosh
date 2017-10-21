package com.craunicproductions.swoosh.Utilities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by michaelcraun on 10/20/17.
 */

const val EXTRA_LEAGUE = "league"
const val EXTRA_SKILL = "skill"

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "${javaClass.simpleName} onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${javaClass.simpleName} onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${javaClass.simpleName} onResume")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "${javaClass.simpleName} onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${javaClass.simpleName} onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${javaClass.simpleName} onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${javaClass.simpleName} onDestroy")
    }
}