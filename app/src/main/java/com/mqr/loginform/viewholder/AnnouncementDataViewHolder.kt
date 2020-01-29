package com.mqr.loginform.viewholder

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.R
import com.mqr.loginform.activity.DetailAnnouncementActivity
import com.mqr.loginform.activity.ListAnnouncementActivity
import com.mqr.loginform.base.AbstractViewHolder
import com.mqr.loginform.entity.Announcement
import com.mqr.loginform.entity.AnnouncementData
import kotlinx.android.synthetic.main.item_announcement.view.*
import kotlinx.android.synthetic.main.item_overview_announcement.view.*

class AnnouncementDataViewHolder(view: View) : AbstractViewHolder<AnnouncementData>(view) {

    private lateinit var adapter: AnnouncementAdapter
    private var lstAnnouncement = view.lstAnnouncement
    private val lblViewAllAnnouncement = view.lblViewAllAnnouncement
    private val lblAnnouncement = view.lblAnnouncement

    override fun bind(element: AnnouncementData) {
        lblViewAllAnnouncement.text = "View All"
        lblAnnouncement.text = "Announcement"
        lblViewAllAnnouncement.setOnClickListener{
            val intent = Intent(it.context, ListAnnouncementActivity::class.java)
//            intent.putExtra("user", user)
            it.context.startActivity(intent)
        }
        adapter = AnnouncementAdapter(element.items)
        lstAnnouncement.layoutManager = LinearLayoutManager(
            itemView.context,
            LinearLayoutManager.VERTICAL,
            false
        )
        lstAnnouncement.adapter = adapter
    }

    class AnnouncementAdapter(
        private val items: List<Announcement>
    ) : RecyclerView.Adapter<AnnouncementAdapter.AnnouncementViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnouncementViewHolder {
            return AnnouncementViewHolder.inflate(parent)
        }

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: AnnouncementViewHolder, position: Int) {
            holder.bind(items[position])

            holder.RootAnnouncementDashboard.setOnClickListener{
                val intent = Intent(it.context, DetailAnnouncementActivity::class.java)
//            intent.putExtra("user", user)
                it.context.startActivity(intent)
            }
        }

        class AnnouncementViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            private val txtAnnouncement = view.txtAnnouncement
            private val txtDateAnnouncement = view.txtDateAnnouncement
            val RootAnnouncementDashboard = view.RootAnnouncementDashboard
            val lblViewAllAnnouncement = view.lblViewAllAnnouncement

            fun bind(announcement: Announcement) {
                txtAnnouncement.text = announcement.message.toString()
                txtDateAnnouncement.text = announcement.date.toString()
            }

            companion object {
                fun inflate(viewGroup: ViewGroup): AnnouncementViewHolder {
                    val view = LayoutInflater
                        .from(viewGroup.context)
                        .inflate(R.layout.item_announcement, viewGroup, false)
                    return AnnouncementViewHolder(view)
                }
            }

        }

    }
    companion object {
        val LAYOUT = R.layout.item_overview_announcement
    }
}