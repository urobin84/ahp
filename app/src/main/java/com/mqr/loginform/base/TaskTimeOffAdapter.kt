package com.mqr.loginform.base

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.R
import com.mqr.loginform.activity.DetailTimeOffTaskActivity
import com.mqr.loginform.entity.TimeOffTask

class TaskTimeOffAdapter(val timeOffTaskList: MutableList<TimeOffTask>) :
    RecyclerView.Adapter<TaskTimeOffAdapter.TaskTimeOffViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskTimeOffViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_timeoff_all, parent, false) as View
        return TaskTimeOffViewHolder(view)
    }

    override fun getItemCount(): Int {
        return timeOffTaskList.size
    }
    override fun onBindViewHolder(holder: TaskTimeOffViewHolder, position: Int) {
        val timeoff = timeOffTaskList[position]
        holder.keteranganTimeOffTask.text = timeoff.keteranganTimeOffTask
        holder.daterangeTimeOffTask.text = timeoff.daterangeTimeOffTask
        holder.statusTimeOffTask.text = timeoff.statusTimeOffTask

        holder.rootTimeOffTask.setOnClickListener{
            val intent = Intent(it.context, DetailTimeOffTaskActivity::class.java)
            it.context.startActivity(intent)
        }

    }

    class TaskTimeOffViewHolder(view : View): RecyclerView.ViewHolder(view) {
        val rootTimeOffTask = view.findViewById<LinearLayout>(R.id.rootTimeOffTask)
        val keteranganTimeOffTask = view.findViewById<TextView>(R.id.keteranganTimeOffTask)
        val daterangeTimeOffTask = view.findViewById<TextView>(R.id.daterangeTimeOffTask)
        val statusTimeOffTask = view.findViewById<TextView>(R.id.statusTimeOffTask)

    }

}
