package com.mqr.loginform.base

import com.mqr.loginform.factory.ItemTypeFactoryAkun

abstract class BaseItemModelAkun {
    abstract fun type(typeFactory: ItemTypeFactoryAkun): Int
}