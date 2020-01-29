package com.mqr.loginform.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.mqr.loginform.R

class DetailMyInfoActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_my_info)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "My Info"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
