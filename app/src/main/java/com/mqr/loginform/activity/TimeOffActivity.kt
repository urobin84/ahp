package com.mqr.loginform.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.mqr.loginform.R
import com.mqr.loginform.ui.TimeOffAFragment
import kotlinx.android.synthetic.main.activity_timeoff_menu.*

class TimeOffActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeoff_menu)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Time Off"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val fragmentAdapter = TimeOffADTAdapter(supportFragmentManager)
        viewpagerTimeOffADT.adapter = fragmentAdapter

        tabsTimeOffADT.setupWithViewPager(viewpagerTimeOffADT)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}

class TimeOffADTAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val pagesTimeOff = listOf(
        TimeOffAFragment(),
        TimeOffDFragment(),
        TimeOffTFragment()

    )

    override fun getItem(position: Int): Fragment {
        return pagesTimeOff[position]
    }

    override fun getCount(): Int {
        return pagesTimeOff.size
    }
    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "All"
            1 -> "Delegation"
            else -> "Taken"
        }
    }

}
