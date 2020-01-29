package com.mqr.loginform.data

import com.mqr.loginform.entity.MyApproval

class MyApprovalData(){
    fun getMyApprovalList(): MutableList<MyApproval>{
        val avatar1 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar2 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar3 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar4 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar5 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar6 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"

        val MyApprovalList:MutableList<MyApproval> = mutableListOf<MyApproval>()
        MyApprovalList.add(MyApproval(avatar1, "Reimbursement", "2"))
        MyApprovalList.add(MyApproval(avatar2, "Cuti", "2"))
        MyApprovalList.add(MyApproval(avatar3, "Absensi", "2"))
        MyApprovalList.add(MyApproval(avatar4, "Lembur", "2"))
        MyApprovalList.add(MyApproval(avatar5, "Perubahan Shift", "2"))
        MyApprovalList.add(MyApproval(avatar6, "Perubahan Data", "2"))
        return  MyApprovalList
    }
}