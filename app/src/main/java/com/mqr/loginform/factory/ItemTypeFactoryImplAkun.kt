package com.mqr.loginform.factory

import android.view.View
import com.mqr.loginform.base.AbstractViewHolderAkun
import com.mqr.loginform.entity.*
import com.mqr.loginform.viewholder.*

class ItemTypeFactoryImplAkun: ItemTypeFactoryAkun {

    override fun type(typeFactory: MyInfoData): Int = MyInfoDataViewHolder.LAYOUT
    override fun type(typeFactory: ProfileAkun): Int = ProfileAkunViewHolder.LAYOUT
    override fun type(typeFactory: SettingData): Int = SettingDataViewHolder.LAYOUT



    override fun createViewHolder(parent: View, type: Int): AbstractViewHolderAkun<*> {
        return when(type) {
            ProfileAkunViewHolder.LAYOUT -> ProfileAkunViewHolder(parent)
            MyInfoDataViewHolder.LAYOUT -> MyInfoDataViewHolder(parent)
            SettingDataViewHolder.LAYOUT -> SettingDataViewHolder(parent)

            else -> createViewHolder(parent, type)
        }
    }

}