package com.mqr.loginform.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mqr.loginform.R

class LiveAttendanceActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liveattendance_menu)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Live Attendance"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
