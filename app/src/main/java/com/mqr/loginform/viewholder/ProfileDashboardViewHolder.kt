package com.mqr.loginform.viewholder

import android.view.View
import com.mqr.loginform.R
import com.mqr.loginform.base.AbstractViewHolder
import com.mqr.loginform.entity.ProfileDashboard
import kotlinx.android.synthetic.main.item_profile_dashboard.view.*

class ProfileDashboardViewHolder(view : View) : AbstractViewHolder<ProfileDashboard>(view){
    private val txtPositionEmployee = view.txtPositionEmployee
    private val txtNameEmployee = view.txtNameEmployee

    override fun bind(element: ProfileDashboard) {
        txtPositionEmployee.text = element.position
        txtNameEmployee.text = element.nama
    }

    companion object {
        val LAYOUT = R.layout.item_profile_dashboard
    }
}