package com.mqr.loginform.base

import com.mqr.loginform.factory.ItemTypeFactory

abstract class BaseItemModel {
    abstract fun type(typeFactory: ItemTypeFactory): Int
}