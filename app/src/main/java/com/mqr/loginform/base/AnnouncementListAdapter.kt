package com.mqr.loginform.base

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.R
import com.mqr.loginform.activity.DetailAnnouncementActivity
import com.mqr.loginform.entity.Announcement_ACT

class AnnouncementListAdapter(var listannouncementList: MutableList<Announcement_ACT>) :
    RecyclerView.Adapter<AnnouncementListAdapter.AnnouncementListViewHolder>() {
//    RecyclerView.Adapter<AnnouncementListAdapter.AnnouncementListViewHolder>(), Filterable {

//    private var mFilteredList: MutableList<Announcement_ACT>? = null
//
//    init {
//        mFilteredList = listannouncementList
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnouncementListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_announcement_list, parent, false) as View
        return AnnouncementListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listannouncementList.size
    }

    override fun onBindViewHolder(holder: AnnouncementListViewHolder, position: Int) {
        val announcement = this.listannouncementList[position]

        when {
            announcement.message.isEmpty() -> holder.message.text = ""
            else -> holder.message.text = announcement.message
        }

        when {
            announcement.date.isEmpty() -> {
                holder.date.text = ""
            }
            else -> {
                holder.date.text = announcement.date
            }
        }

        holder.root.setOnClickListener{
            val intent = Intent( it.context, DetailAnnouncementActivity::class.java)
//            intent.putExtra("user", user)
            it.context.startActivity(intent)
        }

//        val context = holder.avatar.context

//        Glide.with(holder.avatar.context)
//            .load(announcement.avatar)
//            .apply(RequestOptions().override(50,50))
//            .into(holder.avatar)

    }

//    override fun getFilter(): Filter {
//        return object : Filter() {
//            override fun performFiltering(charSequence: CharSequence): Filter.FilterResults {
//                val charString = charSequence.toString()
//                if (charString.isEmpty()) {
//                    mFilteredList = listannouncementList
//                } else {
//                    val filteredList = ArrayList<Announcement_ACT>()
//                    for (announcement in listannouncementList) {
//                        if (announcement.message.toLowerCase().contains(charString)) {
//                            filteredList.add(announcement)
//                        }
//                    }
//                    mFilteredList = filteredList
//                }
//
//                val filterResults = Filter.FilterResults()
//                filterResults.values = mFilteredList
//                return filterResults
//            }
//
//            override fun publishResults(charSequence: CharSequence, filterResults: Filter.FilterResults) {
//                mFilteredList = filterResults.values as MutableList<Announcement_ACT>
//                notifyDataSetChanged()
//            }
//        }
//    }


    class AnnouncementListViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val root = view.findViewById<LinearLayoutCompat>(R.id.RootAnnouncementDashboardList)
        val message = view.findViewById<AppCompatTextView>(R.id.txtAnnouncementList)
        val date = view.findViewById<AppCompatTextView>(R.id.txtDateAnnouncementList)
    }


}
