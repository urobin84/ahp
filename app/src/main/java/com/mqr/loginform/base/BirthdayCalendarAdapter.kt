package com.mqr.loginform.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.R
import com.mqr.loginform.entity.BirthdayCalendar

class BirthdayCalendarAdapter(val birthdayCalendaList: MutableList<BirthdayCalendar>) :
    RecyclerView.Adapter<BirthdayCalendarAdapter.BirthdayCalendarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BirthdayCalendarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_calendar_birthday, parent, false) as View
        return BirthdayCalendarViewHolder(view)
    }

    override fun getItemCount(): Int {
        return birthdayCalendaList.size
    }

    override fun onBindViewHolder(holder: BirthdayCalendarViewHolder, position: Int) {
        val request = this.birthdayCalendaList[position]
        holder.nameBirthdayCalendarList.text = request.nameBirthday
        holder.dateBirthdayCalendarList.text = request.dateBirthday

    }

    class BirthdayCalendarViewHolder(view: View): RecyclerView.ViewHolder(view) {
//        val rootBirthdayCalendarList = view.findViewById<LinearLayout>(R.id.rootBirthdayCalendarList)
        val nameBirthdayCalendarList = view.findViewById<TextView>(R.id.nameBirthdayCalendarList)
        val dateBirthdayCalendarList = view.findViewById<TextView>(R.id.dateBirthdayCalendarList)
    }

}
