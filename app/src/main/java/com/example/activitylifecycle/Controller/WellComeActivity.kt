package com.example.activitylifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.activitylifecycle.R

class WellComeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStrartedBUtton:Button = findViewById(R.id.btnGetStarted)

        getStrartedBUtton.setOnClickListener { view->
            val leagueStarted = Intent(this, LeagueActivity::class.java)
            startActivity(leagueStarted)
        }
    }
}