package com.example.activitylifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylifecycle.Modal.Player
import com.example.activitylifecycle.R
import com.example.activitylifecycle.Uttils.EXTRA_PLAYER
import com.example.activitylifecycle.Uttils.PLAYER_CONSTANT

class SkillActivity : AppCompatActivity() {

    var skill = ""
    lateinit var begginerBtn : ToggleButton
    lateinit var barrerBtn : ToggleButton
    lateinit var player :Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(PLAYER_CONSTANT)!!

        begginerBtn = findViewById(R.id.btnBegginer)
        barrerBtn = findViewById(R.id.btnBaller)

        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }



    fun begginerOnCLick(view: View){
        barrerBtn.isChecked = false
        player.skill = "Begginer"
    }

    fun ballerOnCLick(view: View){
        begginerBtn.isChecked = false
            player.skill = "Baller"
    }

    fun finishOnCLick(view: View){
        if(player.skill?.isNotEmpty() == true){
            val intent = Intent(this, TogglingActivity::class.java)
            intent.putExtra(PLAYER_CONSTANT, player)
            startActivity(intent)
        }
        else
            Toast.makeText(this, "Please Select above options", Toast.LENGTH_LONG).show()
    }

}