package com.mqr.loginform.base

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.R
import com.mqr.loginform.entity.EventCalendar
import com.mqr.loginform.entity.OnLeaveCalendar

class EventCalendarAdapter(val eventCalendaList: MutableList<EventCalendar>) :
    RecyclerView.Adapter<EventCalendarAdapter.EventCalendarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventCalendarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_calendar_event, parent, false) as View
        return EventCalendarViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eventCalendaList.size
    }

    override fun onBindViewHolder(holder: EventCalendarViewHolder, position: Int) {
        val request = this.eventCalendaList[position]
        holder.nameEventCalendarList.text = request.nameEvent
        holder.dateEventCalendarList.text = request.dateEvent

    }

    class EventCalendarViewHolder(view: View): RecyclerView.ViewHolder(view) {
//        val rootEventCalendarList = view.findViewById<LinearLayout>(R.id.rootEventCalendarList)
        val nameEventCalendarList = view.findViewById<TextView>(R.id.nameEventCalendarList)
        val dateEventCalendarList = view.findViewById<TextView>(R.id.dateEventCalendarList)
    }

}
