package com.mqr.loginform.entity

import com.mqr.loginform.base.BaseItemModel
import com.mqr.loginform.factory.ItemTypeFactory

data class ProfileDashboard(
    val nama: String = "",
    val position: String = ""
) : BaseItemModel(){

    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }
}