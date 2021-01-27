package com.example.activitylifecycle.Controller

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylifecycle.Modal.Player
import com.example.activitylifecycle.R
import com.example.activitylifecycle.Uttils.PLAYER_CONSTANT

class TogglingActivity : AppCompatActivity() {

    lateinit var player :Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggling)


        player = intent.getParcelableExtra<Player>(PLAYER_CONSTANT)!!

        val text = findViewById<TextView>(R.id.txQuote)
        text.text = "Locking for a ${player.league} ${player.skill} league ner you... "
    }
}