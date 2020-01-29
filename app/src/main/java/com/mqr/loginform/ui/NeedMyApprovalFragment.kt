package com.mqr.loginform.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.base.MyApprovalAdapter
import com.mqr.loginform.R
import com.mqr.loginform.data.MyApprovalData
import kotlinx.android.synthetic.main.fragment_needmyapproval.*

class NeedMyApprovalFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_needmyapproval, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myApprovalList = MyApprovalData().getMyApprovalList()

        rvNeedMyApproval.layoutManager = LinearLayoutManager(context)
        rvNeedMyApproval.adapter = MyApprovalAdapter(myApprovalList)
    }
}