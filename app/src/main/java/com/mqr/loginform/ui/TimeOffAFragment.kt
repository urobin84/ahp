package com.mqr.loginform.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.R
import com.mqr.loginform.base.AllTimeOffAdapter
import com.mqr.loginform.data.AllTimeOffData
import kotlinx.android.synthetic.main.fragment_timeoff_all.*

class TimeOffAFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_timeoff_all, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val TimeOffAllList = AllTimeOffData().getAllTimeOffList()

        rvTimeOffAll.layoutManager = LinearLayoutManager(context)
        rvTimeOffAll.adapter = AllTimeOffAdapter(TimeOffAllList)
    }
}
