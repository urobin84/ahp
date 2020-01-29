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
import com.mqr.loginform.activity.DetailMyInfoActivity
import com.mqr.loginform.base.AbstractViewHolderAkun
import com.mqr.loginform.entity.MyInfo
import com.mqr.loginform.entity.MyInfoData
import kotlinx.android.synthetic.main.item_myinfo.view.*
import kotlinx.android.synthetic.main.item_overview_my_info.view.*

class MyInfoDataViewHolder(view: View) : AbstractViewHolderAkun<MyInfoData>(view) {

    private lateinit var adapter: MyInfoAdapter
    private var txtCaptionMyInfo = view.txtCaptionMyInfo
    private var lstMyInfo = view.lstMyInfo

    override fun bind(element: MyInfoData) {
        txtCaptionMyInfo.text = "My Info"

        adapter = MyInfoAdapter(element.items)
        lstMyInfo.layoutManager = LinearLayoutManager(
            itemView.context,
            LinearLayoutManager.VERTICAL,
            false
        )
        lstMyInfo.adapter = adapter
    }

    class MyInfoAdapter(
        private val items: List<MyInfo>
    ) : RecyclerView.Adapter<MyInfoAdapter.MyInfoViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyInfoViewHolder {
            return MyInfoViewHolder.inflate(parent)
        }

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: MyInfoViewHolder, position: Int) {
            holder.bind(items[position])


            holder.RootMyinfo.setOnClickListener{
                val intent = Intent(it.context, DetailMyInfoActivity::class.java)
//            intent.putExtra("user", user)
                it.context.startActivity(intent)
            }
        }

        class MyInfoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            private val txtNamaInfo = view.txtNamaInfo
            private val iconInfo = view.iconInfo
            val RootMyinfo = view.RootMyinfo


            fun bind(myinfo: MyInfo) {
                txtNamaInfo.text = myinfo.nameInfo.toString()
                Glide.with(iconInfo.context)
                    .load(myinfo.iconInfo)
                    .apply(RequestOptions().override(50, 50))
                    .into(iconInfo)
            }

            companion object {
                fun inflate(viewGroup: ViewGroup): MyInfoViewHolder {
                    val view = LayoutInflater
                        .from(viewGroup.context)
                        .inflate(R.layout.item_myinfo, viewGroup, false)
                    return MyInfoViewHolder(view)
                }
            }

        }

    }
    companion object {
        val LAYOUT = R.layout.item_overview_my_info
    }
}