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
import com.mqr.loginform.DetailNotification
import com.mqr.loginform.R
import com.mqr.loginform.entity.Notification
import kotlinx.android.synthetic.main.item_notification.view.*

class NotificationAdapter(val notificationList: MutableList<Notification>) :
    RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification, parent, false) as View
        return NotificationViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        val notif = this.notificationList[position]
        holder.NameNotif.text = notif.NameNotif
        holder.messageNotif.text = notif.messageNotif
//        holder.dateMessageNotif.text = notif.dateMessageNotif

        val context = holder.avatar.context

        Glide.with(holder.avatar.context)
            .load(notif.avatarNotif)
            .apply(RequestOptions().override(50,50))
            .into(holder.avatar)

        holder.root.setOnClickListener{
            val intent = Intent(context, DetailNotification::class.java)
            intent.putExtra("data", notif)
            context.startActivity(intent)
        }

    }


    class NotificationViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val root = view.findViewById<ConstraintLayout>(R.id.rootNotifList)
        val avatar = view.findViewById<ImageView>(R.id.avatarNotif)
        val NameNotif = view.findViewById<AppCompatTextView>(R.id.txtNameNotif)
        val messageNotif = view.findViewById<AppCompatTextView>(R.id.txtMessageNotif)
//        val dateMessageNotif = view.findViewById<AppCompatTextView>(R.id.txtDateRequestDetailNotif)
    }

}
