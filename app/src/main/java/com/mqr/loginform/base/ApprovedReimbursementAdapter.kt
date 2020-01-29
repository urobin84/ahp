package com.mqr.loginform.base

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mqr.loginform.DetailActivityApproval
import com.mqr.loginform.R
import com.mqr.loginform.activity.DetailApprovedReimbursementActivity
import com.mqr.loginform.entity.ApprovedReimbursement

class ApprovedReimbursementAdapter(val approvedReimbursementList: MutableList<ApprovedReimbursement>) :
    RecyclerView.Adapter<ApprovedReimbursementAdapter.ApprovedReimbursementViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ApprovedReimbursementViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_approved_reimbursement, parent, false) as View
        return ApprovedReimbursementViewHolder(view)
    }

    override fun getItemCount(): Int {
        return approvedReimbursementList.size
    }

    override fun onBindViewHolder(holder: ApprovedReimbursementViewHolder, position: Int) {
        val approved = this.approvedReimbursementList[position]
        holder.nameApprovedReimbursementFragmentList.text = approved.nameReimbursementApproved
        holder.dateApprovedReimbursementFragmentList.text = approved.dateReimbursementApproved
        holder.paidApprovedReimbursementFragmentList.text = approved.paidReimbursementApproved
        holder.statusApprovedReimbursementFragmentList.text = approved.statusReimbursementApproved

        holder.rootApprovedReimbursementFragmentList.setOnClickListener{
            val intent = Intent(it.context, DetailApprovedReimbursementActivity::class.java)
            it.context.startActivity(intent)
        }
    }


    class ApprovedReimbursementViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val rootApprovedReimbursementFragmentList = view.findViewById<LinearLayout>(R.id.rootApprovedReimbursementFragmentList)
        val nameApprovedReimbursementFragmentList = view.findViewById<TextView>(R.id.nameApprovedReimbursementFragmentList)
        val dateApprovedReimbursementFragmentList = view.findViewById<TextView>(R.id.dateApprovedReimbursementFragmentList)
        val paidApprovedReimbursementFragmentList = view.findViewById<TextView>(R.id.paidApprovedReimbursementFragmentList)
        val statusApprovedReimbursementFragmentList = view.findViewById<TextView>(R.id.statusApprovedReimbursementFragmentList)
    }

}
