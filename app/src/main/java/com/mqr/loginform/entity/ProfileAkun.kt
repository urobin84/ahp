package com.mqr.loginform.entity

import com.mqr.loginform.base.BaseItemModel
import com.mqr.loginform.base.BaseItemModelAkun
import com.mqr.loginform.factory.ItemTypeFactory
import com.mqr.loginform.factory.ItemTypeFactoryAkun

data class ProfileAkun(
    val namaAkun: String = "",
    val positionAkun: String = ""
) : BaseItemModelAkun(){

    override fun type(typeFactory: ItemTypeFactoryAkun): Int {
        return typeFactory.type(this)
    }
}