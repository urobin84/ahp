package com.mqr.loginform.factory

import android.view.View
import com.mqr.loginform.base.AbstractViewHolderAkun
import com.mqr.loginform.entity.*

interface ItemTypeFactoryAkun {
    fun type(typeFactory: ProfileAkun): Int
    fun type(typeFactory: MyInfoData): Int
    fun type(typeFactory: SettingData): Int

    fun createViewHolder(parent: View, type: Int): AbstractViewHolderAkun<*>
}