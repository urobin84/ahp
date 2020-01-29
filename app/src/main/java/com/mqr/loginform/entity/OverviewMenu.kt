package com.mqr.loginform.entity

import com.mqr.loginform.base.BaseItemModel
import com.mqr.loginform.factory.ItemTypeFactory

data class OverviewMenu(
    val Reimbursement: Menu,
    val TimeOff: Menu,
    val LiveAttendance: Menu,
    val Overtime: Menu,
    val Calendar: Menu,
    val Attendance: Menu,
    val MyPayslip: Menu,
    val MyFiles: Menu
) : BaseItemModel() {

    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }

}