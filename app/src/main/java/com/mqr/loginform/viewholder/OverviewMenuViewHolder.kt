package com.mqr.loginform.viewholder


import android.content.Intent
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.mqr.loginform.R
import com.mqr.loginform.activity.*
import com.mqr.loginform.base.AbstractViewHolder
import com.mqr.loginform.entity.Menu
import com.mqr.loginform.entity.OverviewMenu

import kotlinx.android.synthetic.main.item_overview_menu.view.*
import java.security.AccessController.getContext

class OverviewMenuViewHolder(view: View): AbstractViewHolder<OverviewMenu>(view) {

    private val imgReimbursement = view.imgReimbursement
    private val txtReimbursement = view.txtReimbursement

    private val imgTimeOff = view.imgTimeOff
    private val txtTimeOff = view.txtTimeOff

    private val imgLiveAttendance = view.imgLiveAttendance
    private val txtLiveAttendance = view.txtLiveAttendance

    private val imgOvertime = view.imgOvertime
    private val txtOvertime = view.txtOvertime

    private val imgCalendar = view.imgCalendar
    private val txtCalendar = view.txtCalendar

    private val imgAttendance = view.imgAttendance
    private val txtAttendance = view.txtAttendance

    private val imgMyPayslip = view.imgMyPayslip
    private val txtMyPayslip = view.txtMyPayslip

    private val imgMyFiles = view.imgMyFiles
    private val txtMyFiles = view.txtMyFiles



    override fun bind(element: OverviewMenu) {
        setBtnReimbursement(element.Reimbursement)
        setBtnTimeOff(element.TimeOff)
        setBtnLiveAttendance(element.LiveAttendance)
        setBtnOvertime(element.Overtime)
        setBtnCalendar(element.Calendar)
        setBtnAttendance(element.Attendance)
        setBtnMyPayslip(element.MyPayslip)
        setBtnMyFiles(element.MyFiles)

        //myfile
        imgMyFiles.setOnClickListener{
            val intent = Intent(it.context, MyFilesActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        txtMyFiles.setOnClickListener{
            val intent = Intent(it.context, MyFilesActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }

        //imgMyPayslip
        imgMyPayslip.setOnClickListener{
            val intent = Intent(it.context, MyPayslispActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        txtMyPayslip.setOnClickListener{
            val intent = Intent(it.context, MyPayslispActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        imgAttendance.setOnClickListener{
            val intent = Intent(it.context, AttendanceActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        txtAttendance.setOnClickListener{
            val intent = Intent(it.context, AttendanceActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        imgCalendar.setOnClickListener{
            val intent = Intent(it.context, CalendarActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        txtCalendar.setOnClickListener{
            val intent = Intent(it.context, CalendarActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        imgOvertime.setOnClickListener{
            val intent = Intent(it.context, OvertimeActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        txtOvertime.setOnClickListener{
            val intent = Intent(it.context, OvertimeActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        imgLiveAttendance.setOnClickListener{
            val intent = Intent(it.context, LiveAttendanceActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        txtLiveAttendance.setOnClickListener{
            val intent = Intent(it.context, LiveAttendanceActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        imgTimeOff.setOnClickListener{
            val intent = Intent(it.context, TimeOffActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        txtTimeOff.setOnClickListener{
            val intent = Intent(it.context, TimeOffActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
        imgReimbursement.setOnClickListener{
            val intent = Intent(it.context, ReimbursementActivity::class.java)
            it.context.startActivity(intent)
            return@setOnClickListener
        }
    }

    private fun setBtnReimbursement(Reimbursement: Menu) {
        imgReimbursement.setImageResource(Reimbursement.icon)
        txtReimbursement.text = Reimbursement.title
    }

    private fun setBtnTimeOff(TimeOff: Menu) {
        imgTimeOff.setImageResource(TimeOff.icon)
        txtTimeOff.text = TimeOff.title

    }

    private fun setBtnLiveAttendance(LiveAttendance: Menu) {
        imgLiveAttendance.setImageResource(LiveAttendance.icon)
        txtLiveAttendance.text = LiveAttendance.title
    }

    private fun setBtnOvertime(Overtime: Menu) {
        imgOvertime.setImageResource(Overtime.icon)
        txtOvertime.text = Overtime.title
    }

    private fun setBtnCalendar(Calendar: Menu) {
        imgCalendar.setImageResource(Calendar.icon)
        txtCalendar.text = Calendar.title
    }

    private fun setBtnAttendance(Attendance: Menu) {
        imgAttendance.setImageResource(Attendance.icon)
        txtAttendance.text = Attendance.title
    }

    private fun setBtnMyPayslip(MyPayslip: Menu) {
        imgMyPayslip.setImageResource(MyPayslip.icon)
        txtMyPayslip.text = MyPayslip.title
    }

    private fun setBtnMyFiles(MyFiles: Menu) {
        imgMyFiles.setImageResource(MyFiles.icon)
        txtMyFiles.text = MyFiles.title
    }

    companion object {
        val LAYOUT = R.layout.item_overview_menu
    }

}