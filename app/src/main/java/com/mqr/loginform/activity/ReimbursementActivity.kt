package com.mqr.loginform.activity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mqr.loginform.R
import com.mqr.loginform.ui.ReimbursementAFragment
import com.mqr.loginform.ui.ReimbursementRFragment
import kotlinx.android.synthetic.main.activity_attendance_menu.*
import kotlinx.android.synthetic.main.activity_reimbursement_menu.*
import kotlinx.android.synthetic.main.item_reimbursement_tipe.view.*
import java.io.Serializable

class ReimbursementActivity : AppCompatActivity()  {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

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

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)

        // Set up the ViewPager with the sections adapter.
        VPContainerReimbursement.adapter = mSectionsPagerAdapter

//        // get reference to button
//        val btn_click_me = findViewById(R.id.btnRequestReimbursement) as Button
//        // set on-click listener
//        btn_click_me.setOnClickListener {
//            // your code to perform when the user clicks on the button
//            Toast.makeText(this@ReimbursementActivity, "Click Upload Button", Toast.LENGTH_SHORT).show()
//        }

        btnRequestReimbursement.setOnClickListener{
            val intent = Intent(it.context, ReimbursementRequestActivity::class.java)
            it.context.startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}

class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getCount(): Int {
        // Show 5 total pages.(we will use 5 pages so change it to 5)
        return 3
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

class PlaceholderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_reimbursement_tipe, container, false)
        /*since our views are in fragment_main.xml which is inflated in rootView
          so we have to write rootView.oursomeview
          otherwise it will try to find the view in activity_main.xml so app will crash*/
        //handle swipe/slide
        if (arguments!!.getInt(ARG_SECTION_NUMBER) == 1){
            //set title to title_tv
            rootView.reimbursementNominal.text = "Rp 28.066.400"
            //set description to description_tv
            rootView.reimbursementketerangan.text = "Medical Claime OutPatient"
        }
        if (arguments!!.getInt(ARG_SECTION_NUMBER) == 2){
            //set title to title_tv
            rootView.reimbursementNominal.text = "Rp 28.066.400"
            //set description to description_tv
            rootView.reimbursementketerangan.text = "Medical Claime OutPatient"
        }
        if (arguments!!.getInt(ARG_SECTION_NUMBER) == 3){
            //set title to title_tv
            rootView.reimbursementNominal.text = "Rp 28.066.400"
            //set description to description_tv
            rootView.reimbursementketerangan.text = "Medical Claime OutPatient"
        }

        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            val fragment = PlaceholderFragment()
            val args = Bundle()
            args.putInt(ARG_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}

