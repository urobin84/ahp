package com.mqr.loginform.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mqr.loginform.ActionDetailMyApproval
import com.mqr.loginform.MainActivity
import com.mqr.loginform.R
import com.mqr.loginform.entity.HighLight

class RequestHighlightMenuActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var page = ""
        var pageLayout = 0
        val request  = intent.getSerializableExtra("highlight") as HighLight
        Log.d("Menu HIghlight", "${request.title}")

        when (request.title) {
            "Reimbursement" -> {

                page = "Reimbursement"
                setContentView(R.layout.request_reimbursement_activity)

            }
            "Time Off" -> {

                page = "Time Off"
                setContentView(R.layout.request_timeoff_activity)

            }
            "Overtime" -> {

                page = "Overtime"
                setContentView(R.layout.request_overtime_activity)

            }
            "Change Shift" -> {

                page = "Change Shift"
                setContentView(R.layout.request_shift_activity)

            }
            "Attendance" -> {

                page = "Attendance"
                setContentView(R.layout.request_attendance_activity)

            }

            else -> { // Note the block

                    val intent = Intent(this, MainActivity::class.java)
//                  intent.putExtra("user", user)
                    startActivity(intent)

            }
        }


        val actionbar = supportActionBar

        actionbar!!.title = page

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

