package com.mqr.loginform.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.mqr.loginform.R
import kotlinx.android.synthetic.main.activity_mypayslip_menu.*

class MyPayslispActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypayslip_menu)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "My Payslip"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
//        getSupportActionBar()?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
//        getSupportActionBar()?.setCustomView(R.layout.abs_layout)


        datePickerMyPayslip.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View) {
                Toast.makeText(this@MyPayslispActivity, "Click Upload Button", Toast.LENGTH_SHORT).show()
//                selectFilesForUpload()
            }
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
