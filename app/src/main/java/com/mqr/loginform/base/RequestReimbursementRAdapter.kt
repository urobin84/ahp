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
import com.mqr.loginform.R
import com.mqr.loginform.activity.DetailRequestReimbursementActivity
import com.mqr.loginform.entity.RequestReimbursement
import kotlinx.android.synthetic.main.item_rv_request_reimbursement.view.*

class RequestReimbursementRAdapter(val requestReimbursementList: MutableList<RequestReimbursement>) :
    RecyclerView.Adapter<RequestReimbursementRAdapter.RequestReimbursementViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RequestReimbursementViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_request_reimbursement, parent, false) as View
        return RequestReimbursementViewHolder(view)
    }

    override fun getItemCount(): Int {
        return requestReimbursementList.size
    }

    override fun onBindViewHolder(holder: RequestReimbursementViewHolder, position: Int) {
        val request = this.requestReimbursementList[position]
        holder.nameRequestReimbursementFragmentList.text = request.nameReimbursementRequest
        holder.dateRequestReimbursementFragmentList.text = request.dateReimbursementRequest
        holder.paidRequestReimbursementFragmentList.text = request.paidReimbursementRequest
        holder.statusRequestReimbursementFragmentList.text = request.statusReimbursementRequest



        holder.rootRequestReimbursementFragmentList.setOnClickListener{
            val intent = Intent(it.context, DetailRequestReimbursementActivity::class.java)
            it.context.startActivity(intent)
        }
    }


    class RequestReimbursementViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val rootRequestReimbursementFragmentList = view.findViewById<LinearLayout>(R.id.rootRequestReimbursementFragmentList)
        val nameRequestReimbursementFragmentList = view.findViewById<TextView>(R.id.nameRequestReimbursementFragmentList)
        val dateRequestReimbursementFragmentList = view.findViewById<TextView>(R.id.dateRequestReimbursementFragmentList)
        val paidRequestReimbursementFragmentList = view.findViewById<TextView>(R.id.paidRequestReimbursementFragmentList)
        val statusRequestReimbursementFragmentList = view.findViewById<TextView>(R.id.statusRequestReimbursementFragmentList)
    }

}
