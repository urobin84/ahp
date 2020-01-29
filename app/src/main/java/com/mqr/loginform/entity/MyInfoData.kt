package com.mqr.loginform.entity

import com.mqr.loginform.base.BaseItemModelAkun
import com.mqr.loginform.factory.ItemTypeFactoryAkun

data class MyInfoData(
    val items: List<MyInfo> = listOf()
) : BaseItemModelAkun() {

    override fun type(typeFactory: ItemTypeFactoryAkun): Int {
        return typeFactory.type(this)
    }

}