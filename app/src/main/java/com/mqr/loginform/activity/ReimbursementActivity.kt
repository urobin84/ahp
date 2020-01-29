package com.mqr.loginform.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mqr.loginform.R
import com.mqr.loginform.ui.ReimbursementAFragment
import com.mqr.loginform.ui.ReimbursementRFragment
import kotlinx.android.synthetic.main.activity_reimbursement_menu.*

class ReimbursementActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reimbursement_menu)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Reimbursement"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val fragmentAdapter = ReimbursementRAAdapter(supportFragmentManager)
        viewpagerReimbursementRA.adapter = fragmentAdapter

        tabsReimbursementRA.setupWithViewPager(viewpagerReimbursementRA)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}

class ReimbursementRAAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    private val pagesReimbursement = listOf(
        ReimbursementRFragment(),
        ReimbursementAFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pagesReimbursement[position]
    }

    override fun getCount(): Int {
        return pagesReimbursement.size
    }
    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Request"
            else -> "Approved"
        }
    }

}

