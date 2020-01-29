package com.mqr.loginform.base

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mqr.loginform.DetailActivityApproval
import com.mqr.loginform.R
import com.mqr.loginform.entity.MyApproval
import kotlin.coroutines.coroutineContext

class MyApprovalAdapter(val myApprovalList: MutableList<MyApproval>) :
    RecyclerView.Adapter<MyApprovalAdapter.MyApprovalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyApprovalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_needmyapproval, parent, false) as View
        return MyApprovalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return myApprovalList.size
    }

    override fun onBindViewHolder(holder: MyApprovalViewHolder, position: Int) {
        val approval = this.myApprovalList[position]
        holder.nameApproval.text = approval.NameApproval
        holder.countApproval.text = approval.countApproval

        val context = holder.avatar.context

        Glide.with(holder.avatar.context)
            .load(approval.Avatar)
            .apply(RequestOptions().override(50, 50))
            .into(holder.avatar)

        holder.root.setOnClickListener{
            val intent = Intent(context, DetailActivityApproval::class.java)
            context.startActivity(intent)
        }
    }



    class MyApprovalViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val root = view.findViewById<ConstraintLayout>(R.id.rootNeedMyApproval)
        val avatar = view.findViewById<ImageView>(R.id.imgIconMyApproval)
        val nameApproval = view.findViewById<AppCompatTextView>(R.id.txtMyApproval)
        val countApproval = view.findViewById<AppCompatTextView>(R.id.txtCountMyApproval)

    }
}
