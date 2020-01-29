package com.mqr.loginform.entity

import java.io.Serializable

data class Attendance (
    val dateAttendance: String = "",
    val jadwalAttendance: String = "",
    val checkinAttendance: String = "",
    val checkoutAttendance: String = "",
    val timeoffcodeAttendancce: String = "",
    val attendanceCode: String = "",
    val overtimeAttendance: String
):Serializable
