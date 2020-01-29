package com.mqr.loginform

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.mqr.loginform.entity.Notification
import kotlinx.android.synthetic.main.activity_detailnotification.*

class DetailNotification: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailnotification)

//        //actionbar
//        val actionbar = supportActionBar
//        //set actionbar title
//        actionbar!!.title = "New Activity"
//        //set back button
//        actionbar.setDisplayHomeAsUpEnabled(true)

        val notif = intent.getSerializableExtra("data") as Notification

        txtDateRequestDetailNotif.text = notif.dateMessageNotif
        txtNameEmployeeDetailNotif.text = notif.NameNotif
        txtPositionEmployeeDetailNotif.text = notif.NameNotif
    }

//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return true
//    }
}
