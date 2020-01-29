package com.mqr.loginform.base

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.R
import com.mqr.loginform.activity.DetailTimeOffAllActivity
import com.mqr.loginform.entity.TimeOffAll

class AllTimeOffAdapter(val timeOffAllList: MutableList<TimeOffAll>) :
    RecyclerView.Adapter<AllTimeOffAdapter.AllTimeOffViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllTimeOffViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_timeoff_all, parent, false) as View
        return AllTimeOffViewHolder(view)
    }

    override fun getItemCount(): Int {
        return timeOffAllList.size
    }
    override fun onBindViewHolder(holder: AllTimeOffViewHolder, position: Int) {
        val timeoff = timeOffAllList[position]
        holder.keteranganTimeOffAll.text = timeoff.keteranganTimeOffAll
        holder.daterangeTimeOffAll.text = timeoff.daterangeTimeOffAll
        holder.statusTimeOffAll.text = timeoff.statusTimeOffAll

        holder.rootTimeOffAll.setOnClickListener{
            val intent = Intent(it.context, DetailTimeOffAllActivity::class.java)
            it.context.startActivity(intent)
        }

    }

    class AllTimeOffViewHolder(view : View): RecyclerView.ViewHolder(view) {
        val rootTimeOffAll = view.findViewById<LinearLayout>(R.id.rootTimeOffAll)
        val keteranganTimeOffAll = view.findViewById<TextView>(R.id.keteranganTimeOffAll)
        val daterangeTimeOffAll = view.findViewById<TextView>(R.id.daterangeTimeOffAll)
        val statusTimeOffAll = view.findViewById<TextView>(R.id.statusTimeOffAll)

    }

}
