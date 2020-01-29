package com.mqr.loginform.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.R
import com.mqr.loginform.entity.Attendance
import kotlinx.android.synthetic.main.item_attendance.view.*

class AttendanceAdapter(val attendanceList: MutableList<Attendance>) : RecyclerView.Adapter<AttendanceAdapter.AttendanceViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttendanceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_attendance, parent, false) as View
        return AttendanceViewHolder(view)
    }
    override fun getItemCount(): Int {
        return attendanceList.size
    }

    override fun onBindViewHolder(holder: AttendanceViewHolder, position: Int) {
        val attendace = this.attendanceList[position]
        holder.AttendanceCode.text = attendace.attendanceCode
        holder.OvertimeAttendance.text = attendace.overtimeAttendance
        holder.TOCAttendance.text = attendace.timeoffcodeAttendancce
        holder.checkinAttendance.text = attendace.checkinAttendance
        holder.checkoutAttendance.text = attendace.checkoutAttendance
        holder.jadwalAttendance.text = attendace.jadwalAttendance
        holder.dateAttendance.text = attendace.dateAttendance
        holder.childAttendance?.visibility = View.GONE

        holder.expandableAttendance.setOnClickListener{
            if (holder.childAttendance?.visibility == View.VISIBLE) {
                holder.childAttendance?.visibility = View.GONE
                holder.imgBtnExpandAttendance.rotation = 0F
            } else {
                holder.childAttendance?.visibility = View.VISIBLE
                holder.imgBtnExpandAttendance.rotation = 90F
            }
        }

    }




    class AttendanceViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val expandableAttendance = view.findViewById<LinearLayout>(R.id.expandableAttendance)
        val dateAttendance = view.findViewById<TextView>(R.id.dateAttendance)
        val checkinAttendance = view.findViewById<TextView>(R.id.checkinAttendance)
        val checkoutAttendance = view.findViewById<TextView>(R.id.checkoutAttendance)
        val jadwalAttendance = view.findViewById<TextView>(R.id.jadwalAttendance)
        val TOCAttendance = view.findViewById<TextView>(R.id.TOCAttendance)
        val AttendanceCode = view.findViewById<TextView>(R.id.AttendanceCode)
        val OvertimeAttendance = view.findViewById<TextView>(R.id.OvertimeAttendance)
        val childAttendance = view.findViewById<LinearLayout>(R.id.childAttendance)
        val imgBtnExpandAttendance = view.findViewById<ImageView>(R.id.imgBtnExpandAttendance)

    }

}
