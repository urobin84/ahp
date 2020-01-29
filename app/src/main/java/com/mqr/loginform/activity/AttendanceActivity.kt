package com.mqr.loginform.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.mqr.loginform.R

class AttendanceActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance_menu)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Attendance"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
//        getSupportActionBar()?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar()?.setCustomView(R.layout.abs_layout);
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
