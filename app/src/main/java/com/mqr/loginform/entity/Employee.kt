package com.mqr.loginform.entity

import java.io.Serializable

class Employee(
    val avatar: String,
    val id: String,
    val nama: String,
    val jabatan: String,
    val email: String,
    val hp: String
) : Serializable