package com.mqr.loginform.entity

data class RequestReimbursement(
    val nameReimbursementRequest: String = "",
    val dateReimbursementRequest: String = "",
    val paidReimbursementRequest: String = "",
    val statusReimbursementRequest: String = ""
)