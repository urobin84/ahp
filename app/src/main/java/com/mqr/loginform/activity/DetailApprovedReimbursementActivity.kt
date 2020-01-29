package com.mqr.loginform.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mqr.loginform.R

class DetailApprovedReimbursementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitydetail_approved_reimbursement)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail Approved Reimbursement"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
