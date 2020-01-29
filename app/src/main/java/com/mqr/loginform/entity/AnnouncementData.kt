package com.mqr.loginform.entity

import com.mqr.loginform.base.BaseItemModel
import com.mqr.loginform.factory.ItemTypeFactory

data class AnnouncementData(
    val items: List<Announcement> = listOf()
) : BaseItemModel() {

    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }

}