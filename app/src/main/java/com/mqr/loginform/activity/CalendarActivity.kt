package com.mqr.loginform.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.mqr.loginform.R
import com.mqr.loginform.ui.BirthdayCalendarFragment
import com.mqr.loginform.ui.EventCalendarFragment
import com.mqr.loginform.ui.OnLeaveCalendarFragment
import kotlinx.android.synthetic.main.activity_calendar_menu.*

class CalendarActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_menu)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Calendar"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val fragmentAdapter = CalendarAdapter(supportFragmentManager)
        viewpagerCalendar.adapter = fragmentAdapter

        tabsCalendar.setupWithViewPager(viewpagerCalendar)

        btnRequestTimeOff.setOnClickListener{
            val intent = Intent(it.context, TimeOffRequestActivity::class.java)
            it.context.startActivity(intent)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

class CalendarAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val pagesCalendar = listOf(
        OnLeaveCalendarFragment(),
        BirthdayCalendarFragment(),
        EventCalendarFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pagesCalendar[position]
    }

    override fun getCount(): Int {
        return pagesCalendar.size
    }
    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "On Leave"
            1 -> "Birthday"
            else -> "Event"
        }
    }
}
