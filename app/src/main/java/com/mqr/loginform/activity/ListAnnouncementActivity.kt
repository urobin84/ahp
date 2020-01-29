package com.mqr.loginform.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.R
import com.mqr.loginform.base.AnnouncementListAdapter
import com.mqr.loginform.data.AnnouncementListData
import com.mqr.loginform.entity.Announcement_ACT
import com.mqr.loginform.viewholder.AnnouncementDataViewHolder
import kotlinx.android.synthetic.main.activity_list_announcement.*

//class ListAnnouncementActivity: AppCompatActivity(), android.widget.SearchView.OnQueryTextListener {
class ListAnnouncementActivity: AppCompatActivity() {


//    val filteredAnnouncement = ArrayList<Announcement_ACT>()
//    val announcementList = AnnouncementListData().getAnnouncementList()
//    val adapter = AnnouncementListAdapter(announcementList)
//    val filteredAnnouncementAdapter = AnnouncementListAdapter(filteredAnnouncement)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_announcement)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Announcement"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


        val announcementList = AnnouncementListData().getAnnouncementList()

        lstAnnouncementItemsList.layoutManager = LinearLayoutManager(this)
        lstAnnouncementItemsList.adapter = AnnouncementListAdapter(announcementList)

//        edSearchAnnouncement.setOnQueryTextListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

//    override fun onQueryTextSubmit(newText: String?): Boolean {
////        edSearchAnnouncement.visibility = View.GONE
//        val announcementList = AnnouncementListData().getAnnouncementList()
//        if(newText?.isEmpty()!!){
//            lstAnnouncementItemsList.adapter = AnnouncementListAdapter(announcementList)
//        }else{
//            filteredAnnouncement.clear()
//            for (announcement in announcementList){
//                if (announcement.message.toLowerCase().contains(newText?.toLowerCase())){
//                    filteredAnnouncement.add(announcement)
//                }
//            }
//            if (filteredAnnouncement.isEmpty()){
//                //showing the empty textview when the list is empty
////                filteredAnnouncement.visibility= View.VISIBLE
//            }
//            lstAnnouncementItemsList.adapter = filteredAnnouncementAdapter
//        }
//        return false
//    }

//    override fun onQueryTextChange(newText: String?): Boolean {
////        edSearchAnnouncement.visibility = View.GONE
//        val announcementList = AnnouncementListData().getAnnouncementList()
//        if(newText?.isEmpty()!!){
//            lstAnnouncementItemsList.adapter = AnnouncementListAdapter(announcementList)
//        }else{
//            filteredAnnouncement.clear()
//            for (announcement in announcementList){
//                if (announcement.message.toLowerCase().contains(newText?.toLowerCase())){
//                    filteredAnnouncement.add(announcement)
//                }
//            }
//            if (filteredAnnouncement.isEmpty()){
//                //showing the empty textview when the list is empty
////                filteredAnnouncement.visibility= View.VISIBLE
//            }
//            lstAnnouncementItemsList.adapter = filteredAnnouncementAdapter
//        }
//        return false
//    }

}
