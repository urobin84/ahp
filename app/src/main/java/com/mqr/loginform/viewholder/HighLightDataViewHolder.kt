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
import com.mqr.loginform.activity.RequestHighlightMenuActivity
import com.mqr.loginform.base.AbstractViewHolder
import com.mqr.loginform.entity.HighLight
import com.mqr.loginform.entity.HighLightData
import kotlinx.android.synthetic.main.item_highlight.view.*
import kotlinx.android.synthetic.main.item_overview_highlights.view.*

class HighLightDataViewHolder(view: View): AbstractViewHolder<HighLightData>(view) {

    private lateinit var adapter: HighLightAdapter
    private var lstHighlight = view.lstHighLight

    override fun bind(element: HighLightData) {
        adapter = HighLightAdapter(element.items)
        lstHighlight.layoutManager = LinearLayoutManager(
            itemView.context,
            LinearLayoutManager.HORIZONTAL,
            false)
        lstHighlight.adapter = adapter
    }

    class HighLightAdapter(
        private val items: List<HighLight>
    ) : RecyclerView.Adapter<HighLightAdapter.HighLightViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HighLightViewHolder {
            return HighLightViewHolder.inflate(parent)
        }

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: HighLightViewHolder, position: Int) {
            holder.bind(items[position])

        }

        class HighLightViewHolder(view: View): RecyclerView.ViewHolder(view) {

            private val txtTitle = view.txtTitle
            private val txtTag = view.txtTag
            private val imgIconHiligh = view.imgIconHiligh
            private val rootHilight = view.rootHilight

            fun bind(highLight: HighLight) {
                txtTitle.text = highLight.title
                txtTag.text = highLight.tag

                Glide.with(imgIconHiligh)
                    .load(highLight.iconHighLight)
                    .apply(RequestOptions().override(1000, 1000))
                    .into(imgIconHiligh)

                rootHilight.setOnClickListener{
                    val intent = Intent(it.context, RequestHighlightMenuActivity::class.java)
                    intent.putExtra("highlight", highLight)
                    it.context.startActivity(intent)
                }


            }

            companion object {
                fun inflate(viewGroup: ViewGroup): HighLightViewHolder {
                    val view = LayoutInflater
                        .from(viewGroup.context)
                        .inflate(R.layout.item_highlight, viewGroup, false)
                    return HighLightViewHolder(view)
                }
            }

        }
    }

    companion object {
        val LAYOUT = R.layout.item_overview_highlights
    }

}