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
import com.mqr.loginform.activity.DetailTimeOffDelegationActivity
import com.mqr.loginform.entity.TimeOffAll
import com.mqr.loginform.entity.TimeOffDelegation

class DelegationTimeOffAdapter(val timeOffDelegationList: MutableList<TimeOffDelegation>) :
    RecyclerView.Adapter<DelegationTimeOffAdapter.DelegationTimeOffViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DelegationTimeOffViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_timeoff_delegation, parent, false) as View
        return DelegationTimeOffViewHolder(view)
    }

    override fun getItemCount(): Int {
        return timeOffDelegationList.size
    }
    override fun onBindViewHolder(holder: DelegationTimeOffViewHolder, position: Int) {
        val timeoff = timeOffDelegationList[position]
        holder.keteranganTimeOffDelegation.text = timeoff.keteranganTimeOffDelegation
        holder.daterangeTimeOffDelegation.text = timeoff.daterangeTimeOffDelegation
        holder.statusTimeOffDelegation.text = timeoff.statusTimeOffDelegation

        holder.rootTimeOffDelegation.setOnClickListener{
            val intent = Intent(it.context, DetailTimeOffDelegationActivity::class.java)
            it.context.startActivity(intent)
        }

    }

    class DelegationTimeOffViewHolder(view : View): RecyclerView.ViewHolder(view) {
        val rootTimeOffDelegation = view.findViewById<LinearLayout>(R.id.rootTimeOffDelegation)
        val keteranganTimeOffDelegation = view.findViewById<TextView>(R.id.keteranganTimeOffDelegation)
        val daterangeTimeOffDelegation = view.findViewById<TextView>(R.id.daterangeTimeOffDelegation)
        val statusTimeOffDelegation = view.findViewById<TextView>(R.id.statusTimeOffDelegation)

    }

}
