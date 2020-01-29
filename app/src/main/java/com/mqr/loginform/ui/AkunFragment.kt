package com.mqr.loginform.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mqr.loginform.R
import com.mqr.loginform.base.BaseListAdapterAkun
import com.mqr.loginform.entity.*
import com.mqr.loginform.factory.ItemTypeFactoryImplAkun
import kotlinx.android.synthetic.main.activity_akun.*

class AkunFragment : Fragment(){

    lateinit var adapter: BaseListAdapterAkun

    companion object{
        fun newInstance()
                : AkunFragment {
            return AkunFragment()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.activity_akun, container, false)
        return view
    }

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = BaseListAdapterAkun(ItemTypeFactoryImplAkun())
        lstAkunItems.layoutManager = LinearLayoutManager(getActivity())
        lstAkunItems.adapter = adapter

        profileAkunItem()
        MyInfoItem()
        SettingItem()


    }

    private fun profileAkunItem() {
        val profileAkun = listOf(
            ProfileAkun("Taufik Hidayat", "Admin-Finance & Accounting Manager")
        )
        adapter.addItem(profileAkun)
    }


    private fun MyInfoItem() {
        val myinfo = listOf(
            MyInfoData(listOf(
                MyInfo(R.drawable.icon_person,"1", "Info Personal"),
                MyInfo(R.drawable.icon_work,"2", "Info Pekerjaan"),
                MyInfo(R.drawable.icon_phone,"3", "Info Kontak Darurat"),
                MyInfo(R.drawable.icon_family,"4", "Info Keluarga"),
                MyInfo(R.drawable.icon_student,"5", "Info Pendidikan"),
                MyInfo(R.drawable.icon_payroll,"6", "Info Payroll"),
                MyInfo(R.drawable.icon_myfile,"7", "File Saya")

            ))
        )
        adapter.addItem(myinfo)
    }

    private fun SettingItem() {
        val setting = listOf(
            SettingData(listOf(
                Setting(R.drawable.icon_key,"1", "Ubah Kata sandi"),
                Setting(R.drawable.icon_privacy,"1", "PIN"),
                Setting(R.drawable.icon_pengingat,"1", "Pengingat Clock In/Out"),
                Setting(R.drawable.icon_translate,"1", "Bahasa"),
                Setting(R.drawable.icon_logout,"1", "Keluar")
            ))
        )
        adapter.addItem(setting)
    }
}