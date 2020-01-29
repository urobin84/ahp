package com.mqr.loginform.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mqr.loginform.R
import kotlinx.android.synthetic.main.activity_inbox.*

class InboxFragment : Fragment(){


    companion object{
        fun newInstance()
                : InboxFragment {
            return InboxFragment()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.activity_inbox, container, false)
        return view
    }

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentAdapter = InboxPagerAdapter(getChildFragmentManager())
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)

    }

}

class InboxPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        NotificationFragment(),
        NeedMyApprovalFragment()
    )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Notification"
            else -> "Need My Approval"
        }
    }
}