package com.mqr.loginform.factory

import android.view.View
import com.mqr.loginform.base.AbstractViewHolder
import com.mqr.loginform.entity.*
import com.mqr.loginform.viewholder.*

class ItemTypeFactoryImpl: ItemTypeFactory {

    override fun type(typeFactory: OverviewMenu): Int = OverviewMenuViewHolder.LAYOUT

    override fun type(typeFactory: HighLightData): Int = HighLightDataViewHolder.LAYOUT

    override fun type(typeFactory: AnnouncementData): Int = AnnouncementDataViewHolder.LAYOUT

    override fun type(typeFactory: ProfileDashboard): Int = ProfileDashboardViewHolder.LAYOUT

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when(type) {
            HighLightDataViewHolder.LAYOUT -> HighLightDataViewHolder(parent)
            AnnouncementDataViewHolder.LAYOUT -> AnnouncementDataViewHolder(parent)
            OverviewMenuViewHolder.LAYOUT -> OverviewMenuViewHolder(parent)
            ProfileDashboardViewHolder.LAYOUT -> ProfileDashboardViewHolder(parent)
            else -> createViewHolder(parent, type)
        }
    }

}