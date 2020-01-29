package com.mqr.loginform.viewholder

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mqr.loginform.R
import com.mqr.loginform.activity.DetailSettingActivity
import com.mqr.loginform.base.AbstractViewHolderAkun
import com.mqr.loginform.entity.Setting
import com.mqr.loginform.entity.SettingData
import kotlinx.android.synthetic.main.item_overview_setting.view.*
import kotlinx.android.synthetic.main.item_setting.view.*

class SettingDataViewHolder(view: View) : AbstractViewHolderAkun<SettingData>(view) {

    private lateinit var adapter: SettingAdapter
    private var txtCaptionSetting = view.txtCaptionSetting
    private var lstSetting = view.lstSetting

    override fun bind(element: SettingData) {
        txtCaptionSetting.text = "Pengaturan"

        adapter = SettingAdapter(element.items)
        lstSetting.layoutManager = LinearLayoutManager(
            itemView.context,
            LinearLayoutManager.VERTICAL,
            false
        )
        lstSetting.adapter = adapter
    }

    class SettingAdapter(
        private val items: List<Setting>
    ) : RecyclerView.Adapter<SettingAdapter.SettingViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingViewHolder {
            return SettingViewHolder.inflate(parent)
        }

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: SettingViewHolder, position: Int) {
            holder.bind(items[position])

            holder.RootSetting.setOnClickListener{
                val intent = Intent(it.context, DetailSettingActivity::class.java)
//            intent.putExtra("user", user)
                it.context.startActivity(intent)
            }
        }

        class SettingViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            private val txtNamaSetting = view.txtNamaSetting
            private val iconSetting = view.iconSetting
            val RootSetting = view.RootSetting


            fun bind(setting: Setting) {
                txtNamaSetting.text = setting.nameSetting.toString()
                Glide.with(iconSetting.context)
                    .load(setting.iconSetting)
                    .apply(RequestOptions().override(50, 50))
                    .into(iconSetting)

            }

            companion object {
                fun inflate(viewGroup: ViewGroup): SettingViewHolder {
                    val view = LayoutInflater
                        .from(viewGroup.context)
                        .inflate(R.layout.item_setting, viewGroup, false)
                    return SettingViewHolder(view)
                }
            }

        }

    }
    companion object {
        val LAYOUT = R.layout.item_overview_setting
    }
}