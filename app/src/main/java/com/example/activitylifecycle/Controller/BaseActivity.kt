package com.example.activitylifecycle.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG_MESSAGE = "Log Message"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG_MESSAGE, "${javaClass.simpleName} onCreate Method" )
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG_MESSAGE, "${javaClass.simpleName} onStart Method" )

        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG_MESSAGE, "${javaClass.simpleName} onResume Method" )
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG_MESSAGE, "${javaClass.simpleName} onPause Method" )
        super.onPause()
    }

    override fun onRestart() {
        Log.d(TAG_MESSAGE, "${javaClass.simpleName} onRestart Method" )
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG_MESSAGE, "${javaClass.simpleName} onStop Method" )
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG_MESSAGE, "${javaClass.simpleName} onDestroy Method" )
        super.onDestroy()
    }
}