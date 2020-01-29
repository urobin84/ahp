package com.mqr.loginform.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mqr.loginform.R
import com.mqr.loginform.entity.Employee
import java.util.ArrayList

class EmployeeAdapter(var employeeList: MutableList<Employee>) :
    RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>(), Filterable {

    private var mFilteredList: MutableList<Employee>? = null

    init {
        mFilteredList = employeeList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_employee_list, parent, false) as View
        return EmployeeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return employeeList.size
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee = this.employeeList[position]
        holder.NameEmployee.text = employee.nama
        holder.JabatanEmployee.text = employee.jabatan

        val context = holder.avatar.context

        Glide.with(holder.avatar.context)
            .load(employee.avatar)
            .apply(RequestOptions().override(50,50))
            .into(holder.avatar)

    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): Filter.FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                    mFilteredList = employeeList
                } else {
                    val filteredList = ArrayList<Employee>()
                    for (employeel in employeeList) {
                        if (employeel.nama.toLowerCase().contains(charString)
                            || employeel.avatar.toLowerCase().contains(charString)) {
                            filteredList.add(employeel)
                        }
                    }
                    mFilteredList = filteredList
                }

                val filterResults = Filter.FilterResults()
                filterResults.values = mFilteredList
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence, filterResults: Filter.FilterResults) {
                mFilteredList = filterResults.values as MutableList<Employee>
                notifyDataSetChanged()
            }
        }
    }


    class EmployeeViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val root = view.findViewById<ConstraintLayout>(R.id.rootNotifList)
        val avatar = view.findViewById<ImageView>(R.id.ivAvatarEmployee)
        val NameEmployee = view.findViewById<AppCompatTextView>(R.id.txtEmployee)
        val JabatanEmployee = view.findViewById<AppCompatTextView>(R.id.txtJabatanEmployee)
    }

}
