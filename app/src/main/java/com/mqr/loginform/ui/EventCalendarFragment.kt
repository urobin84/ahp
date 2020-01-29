package com.mqr.loginform.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.R
import com.mqr.loginform.base.EventCalendarAdapter
import com.mqr.loginform.base.OnLeaveCalendarAdapter
import com.mqr.loginform.data.EventCalendarData
import com.mqr.loginform.data.OnLeaveCalendarData
import kotlinx.android.synthetic.main.fragment_calendar_event.*
import kotlinx.android.synthetic.main.fragment_calendar_on_leave.*

class EventCalendarFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_calendar_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val EventCalendaList = EventCalendarData().getEventCalendarList()

        rvCalendarEvent.layoutManager = LinearLayoutManager(context)
        rvCalendarEvent.adapter = EventCalendarAdapter(EventCalendaList)
    }
}
