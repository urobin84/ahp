package com.mqr.loginform.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.R
import com.mqr.loginform.R.*
import com.mqr.loginform.activity.ListAnnouncementActivity
import com.mqr.loginform.activity.MyFilesActivity
import com.mqr.loginform.base.BaseListAdapter
import com.mqr.loginform.entity.*
import com.mqr.loginform.factory.ItemTypeFactoryImpl
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_overview_announcement.*
import kotlinx.android.synthetic.main.item_overview_announcement.view.*
import kotlinx.android.synthetic.main.item_overview_menu.*


class HomeFragment : Fragment(){

    lateinit var adapter: BaseListAdapter

    companion object{
        fun newInstance()
                : HomeFragment {
            return HomeFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(layout.activity_main, container, false)
        return view
    }

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = BaseListAdapter(ItemTypeFactoryImpl())
        lstItems.layoutManager = LinearLayoutManager(getActivity())
        lstItems.adapter = adapter

        profiledashboardItem()
        overviewMenu()
        highLightItem()
        AnnouncementItem()


        //imgMyFiles.background = getActivity()?.let { ContextCompat.getDrawable(it, R.drawable.btn_custom) }

    }

    private fun profiledashboardItem() {
        val profileDashboards = listOf(
            ProfileDashboard("Taufik Hidayat", "Admin-Finance & Accounting Manager")
        )
        adapter.addItem(profileDashboards)
    }

    private fun AnnouncementItem() {

        val announcement = listOf(
            AnnouncementData(listOf(
                Announcement("lorem ipsum dor ope onde onde mantap", "26-Des-2019"),
                Announcement("lorem ipsum dor ope onde onde mantap", "26-Des-2019"),
                Announcement("lorem ipsum dor ope onde onde mantap", "26-Des-2019")
            ))
        )
        adapter.addItem(announcement)




    }

    private fun overviewMenu() {
        val overviewMenus = listOf(
            OverviewMenu(
                Menu(drawable.icon_reimbursment, "Reimbursement"),
                Menu(drawable.icon_time_off, "Time Off"),
                Menu(drawable.icon_pin, "Live Attendance"),
                Menu(drawable.icon_overtime2, "Overtime"),
                Menu(drawable.icon_pengingat, "Calendar"),
                Menu(drawable.icon_attendance, "Attendance"),
                Menu(drawable.icon_payroll, "My Payslip"),
                Menu(drawable.icon_myfile, "My Files")
            )
        )
        adapter.addItem(overviewMenus)
    }

    private fun highLightItem() {
        val highlights = listOf(
            HighLightData(listOf(
                HighLight(drawable.icon_reimbursment, "Reimbursement", "Request"),
                HighLight(drawable.icon_time_off,"Time Off", "Request"),
                HighLight(drawable.icon_attendance,"Attendance", "Request"),
                HighLight(drawable.icon_av_timer_black,"Change Shift", "Request"),
                HighLight(drawable.icon_overtime2,"Overtime", "Request")
            ))
        )
        adapter.addItem(highlights)
    }


}