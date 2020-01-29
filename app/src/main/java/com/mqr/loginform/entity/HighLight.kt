package com.mqr.loginform.entity

import java.io.Serializable

data class HighLight(
    val iconHighLight: Int = 0,
    val title: String = "",
    val tag: String = ""
) : Serializable