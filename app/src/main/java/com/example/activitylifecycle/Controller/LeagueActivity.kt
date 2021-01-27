package com.example.activitylifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.activitylifecycle.Modal.Player
import com.example.activitylifecycle.R
import com.example.activitylifecycle.Uttils.EXTRA_PLAYER
import com.example.activitylifecycle.Uttils.PLAYER_CONSTANT

class LeagueActivity : BaseActivity() {

    //region Button Initialize
    lateinit var btnMents : ToggleButton
    lateinit var btnWoments: ToggleButton
    lateinit var btnCoEd: ToggleButton
    //endregion

    var player =Player("","")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        btnMents = findViewById<ToggleButton>(R.id.btnMens)
        btnWoments = findViewById<ToggleButton>(R.id.btnWomens)
        btnCoEd = findViewById<ToggleButton>(R.id.btnCoEd)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }
    fun onClickbtnMens(view: View){
        btnCoEd.isChecked = false
        btnWoments.isChecked = false
        player.league = "Men"
    }

    fun onClickbtnWomens(view :View){
        btnMents.isChecked = false
        btnCoEd.isChecked = false
        player.league = "Women"
    }

    fun onClickbtnCoEd(view: View){
        btnMents.isChecked = false
        btnWoments.isChecked = false
        player.league = "Co-Ed"
    }

    fun onClickbtnNext(veiw: View)
    {
        if (player.league?.isNotEmpty() == true) {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(PLAYER_CONSTANT, player)
            startActivity(intent)
        }
        else
            Toast.makeText(this, "Please select any one selection in above", Toast.LENGTH_LONG).show()
    }
}