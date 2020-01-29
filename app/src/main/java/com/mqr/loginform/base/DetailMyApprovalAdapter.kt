package com.mqr.loginform.base

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mqr.loginform.ActionDetailMyApproval
import com.mqr.loginform.R
import com.mqr.loginform.entity.DetailMyApproval

class DetailMyApprovalAdapter(val detailMyApprovalList: MutableList<DetailMyApproval>) :
    RecyclerView.Adapter<DetailMyApprovalAdapter.DetailMyApprovalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailMyApprovalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail_needmyapproval, parent, false) as View
        return DetailMyApprovalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return detailMyApprovalList.size
    }

    override fun onBindViewHolder(holder: DetailMyApprovalViewHolder, position: Int) {
        val detailmyapproval = this.detailMyApprovalList[position]
        holder.nameEmployee.text = detailmyapproval.NameEmployee
        holder.NameRequest.text = detailmyapproval.NameRequest
        holder.CaptionRequest.text = detailmyapproval.CaptionRequest
        holder.DateRequest.text = detailmyapproval.DateRequest
        holder.StateRequest.text = detailmyapproval.StateRequest

        val context = holder.avatar.context

        Glide.with(holder.avatar.context)
            .load(detailmyapproval.Avatar)
            .apply(RequestOptions().override(1000, 1000))
            .into(holder.avatar)

        holder.root.setOnClickListener{
            val intent = Intent(context, ActionDetailMyApproval::class.java)
//            intent.putExtra("user", user)
            context.startActivity(intent)
        }
    }

    class DetailMyApprovalViewHolder(view : View): RecyclerView.ViewHolder(view) {
        val root = view.findViewById<ConstraintLayout>(R.id.rootDetailNeedMyApproval)
        val avatar = view.findViewById<ImageView>(R.id.imgAvatarMyApproval)
        val nameEmployee = view.findViewById<AppCompatTextView>(R.id.txtNameEmployeeMyApproval)
        val NameRequest = view.findViewById<AppCompatTextView>(R.id.txtNameRequestMyApproval)
        val CaptionRequest = view.findViewById<AppCompatTextView>(R.id.txtCaptionRequestMyApproval)
        val DateRequest = view.findViewById<AppCompatTextView>(R.id.txtDateRequestMyApproval)
        val StateRequest = view.findViewById<AppCompatTextView>(R.id.txtStateRequestMyApproval)
    }

}
