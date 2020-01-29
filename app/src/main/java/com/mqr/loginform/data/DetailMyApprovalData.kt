package com.mqr.loginform.data

import com.mqr.loginform.entity.DetailMyApproval



class DetailMyApprovalData(){
    fun getDetailMyApprovalList(): MutableList<DetailMyApproval>{
        val avatar1 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar2 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar3 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar4 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar5 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val avatar6 = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"

        val DetailMyApprovalList:MutableList<DetailMyApproval> = mutableListOf<DetailMyApproval>()
        DetailMyApprovalList.add(DetailMyApproval(avatar1, "Hidayat Taufik", "Over Time Request", "Journaling", "20 Jan", "Approved"))
        DetailMyApprovalList.add(DetailMyApproval(avatar2, "Hidayat Taufik", "Over Time Request", "Journaling", "20 Jan", "Approved"))
        DetailMyApprovalList.add(DetailMyApproval(avatar3, "Hidayat Taufik", "Over Time Request", "Journaling", "20 Jan", "Approved"))
        DetailMyApprovalList.add(DetailMyApproval(avatar4, "Hidayat Taufik", "Over Time Request", "Journaling", "20 Jan", "Approved"))
        DetailMyApprovalList.add(DetailMyApproval(avatar5, "Hidayat Taufik", "Over Time Request", "Journaling", "20 Jan", "Approved"))
        DetailMyApprovalList.add(DetailMyApproval(avatar6, "Hidayat Taufik", "Over Time Request", "Journaling", "20 Jan", "Approved"))

        return  DetailMyApprovalList
    }
}