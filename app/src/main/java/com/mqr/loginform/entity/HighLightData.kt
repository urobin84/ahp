package com.mqr.loginform.entity

import com.mqr.loginform.base.BaseItemModel
import com.mqr.loginform.factory.ItemTypeFactory

data class HighLightData(
    val items: List<HighLight> = listOf()
) : BaseItemModel() {

    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }

}