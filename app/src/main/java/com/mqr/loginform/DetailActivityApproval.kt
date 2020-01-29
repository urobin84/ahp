package com.mqr.loginform

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.base.DetailMyApprovalAdapter
import com.mqr.loginform.data.DetailMyApprovalData
import kotlinx.android.synthetic.main.activity_detailmyapproval.*

class DetailActivityApproval : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailmyapproval)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Need My Approval"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val DetailApprovalList = DetailMyApprovalData().getDetailMyApprovalList()

        rvDetailMyApproval.layoutManager = LinearLayoutManager(this)
        rvDetailMyApproval.adapter = DetailMyApprovalAdapter(DetailApprovalList)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}