package com.mqr.loginform.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.R
import com.mqr.loginform.base.AttendanceAdapter
import com.mqr.loginform.data.AttendanceData
import kotlinx.android.synthetic.main.activity_attendance_menu.*

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

        val OnLeaveCalendaList = AttendanceData().getAttendanceList()

        rvAttendance.layoutManager = LinearLayoutManager(this)
        rvAttendance.adapter = AttendanceAdapter(OnLeaveCalendaList)

        btnRequestAttendance.setOnClickListener{
            val intent = Intent(it.context, AttendanceRequestActivity::class.java)
            it.context.startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
