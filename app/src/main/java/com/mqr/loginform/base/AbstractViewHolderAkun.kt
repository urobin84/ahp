package com.mqr.loginform.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class AbstractViewHolderAkun<in T>(
    private val view:View
): RecyclerView.ViewHolder(view){

    abstract fun bind(element: T)

}