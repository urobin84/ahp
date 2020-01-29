package com.mqr.loginform.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.factory.ItemTypeFactoryAkun
import java.util.ArrayList

class BaseListAdapterAkun(
    private val adapterTypeFactory: ItemTypeFactoryAkun,
    private val items: ArrayList<BaseItemModelAkun> = arrayListOf()
): RecyclerView.Adapter<AbstractViewHolderAkun<BaseItemModelAkun>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolderAkun<BaseItemModelAkun> {
        val view = inflateItem(parent, viewType)
        return adapterTypeFactory.createViewHolder(view, viewType) as AbstractViewHolderAkun<BaseItemModelAkun>
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: AbstractViewHolderAkun<BaseItemModelAkun>, position: Int) {
        holder.bind(items[position])
    }

    private fun inflateItem(viewGroup: ViewGroup, viewType: Int): View {
        return LayoutInflater.from(viewGroup.context).inflate(viewType, viewGroup, false)
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type(adapterTypeFactory)
    }

    fun addItem(items: List<BaseItemModelAkun>) {
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun removeItem(item: BaseItemModelAkun) {
        this.items.remove(item)
        notifyDataSetChanged()
    }

}