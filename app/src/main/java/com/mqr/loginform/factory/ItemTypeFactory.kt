package com.mqr.loginform.factory

import android.view.View
import com.mqr.loginform.base.AbstractViewHolder
import com.mqr.loginform.entity.*

interface ItemTypeFactory {
    fun type(typeFactory: OverviewMenu): Int
    fun type(typeFactory: HighLightData): Int
    fun type(typeFactory: ProfileDashboard): Int
    fun type(typeFactory: AnnouncementData): Int

    fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*>
}