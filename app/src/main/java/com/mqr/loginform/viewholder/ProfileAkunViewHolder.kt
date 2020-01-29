package com.mqr.loginform.viewholder

import android.view.View
import com.mqr.loginform.R
import com.mqr.loginform.base.AbstractViewHolder
import com.mqr.loginform.base.AbstractViewHolderAkun
import com.mqr.loginform.entity.ProfileAkun
import com.mqr.loginform.entity.ProfileDashboard
import kotlinx.android.synthetic.main.item_profile_akun.view.*
import kotlinx.android.synthetic.main.item_profile_dashboard.view.*

class ProfileAkunViewHolder(view : View) : AbstractViewHolderAkun<ProfileAkun>(view){
    private val txtJabatanAkun = view.txtJabatanAkun
    private val txtNameAkun = view.txtNameAkun

    override fun bind(element: ProfileAkun) {
        txtJabatanAkun.text = element.positionAkun
        txtNameAkun.text = element.namaAkun
    }

    companion object {
        val LAYOUT = R.layout.item_profile_akun
    }
}