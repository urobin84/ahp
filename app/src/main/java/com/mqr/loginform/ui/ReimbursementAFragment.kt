package com.mqr.loginform.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.R
import com.mqr.loginform.base.ApprovedReimbursementAdapter
import com.mqr.loginform.data.ApprovedReimbursementData
import kotlinx.android.synthetic.main.fragment_reimbursement_a.*

class ReimbursementAFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_reimbursement_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ApprovedReimbursementList = ApprovedReimbursementData().getApprovedReimbursementList()
//
        rvRequestReimbursementA.layoutManager = LinearLayoutManager(context)
        rvRequestReimbursementA.adapter = ApprovedReimbursementAdapter(ApprovedReimbursementList)
    }
}
