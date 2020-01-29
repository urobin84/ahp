package com.mqr.loginform.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mqr.loginform.R
import com.mqr.loginform.base.EmployeeAdapter
import com.mqr.loginform.data.EmployeeData
import com.mqr.loginform.entity.Employee


import kotlinx.android.synthetic.main.activity_employee.*
import java.util.Locale.filter


class EmployeeFragment : Fragment(), android.widget.SearchView.OnQueryTextListener {

    val filteredEmployee = ArrayList<Employee>()
    val employeelList = EmployeeData().getEmployeeList()
    val adapter = EmployeeAdapter(employeelList)
    val filteredAdapter = EmployeeAdapter(filteredEmployee)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater!!.inflate(R.layout.activity_employee, container, false)
    }

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val employeeList = EmployeeData().getEmployeeList()

        lstEmployeeItems.layoutManager = LinearLayoutManager(context)
        lstEmployeeItems.adapter = EmployeeAdapter(employeeList)

        edSearchEmployee.setOnQueryTextListener(this)
    }

    override fun onQueryTextSubmit(newText: String?): Boolean {
//        edSearchEmployee.visibility = View.GONE
        val employeeList = EmployeeData().getEmployeeList()
        if(newText?.isEmpty()!!){
            lstEmployeeItems.adapter = EmployeeAdapter(employeeList)
        }else{
            filteredEmployee.clear()
            for (employee in employeelList){
                if (employee.nama.toLowerCase().contains(newText?.toLowerCase())){
                    filteredEmployee.add(employee)
                }
            }
            if (filteredEmployee.isEmpty()){
                //showing the empty textview when the list is empty
                edSearchEmployee.visibility= View.VISIBLE
            }
            lstEmployeeItems.adapter = filteredAdapter
        }
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
//        edSearchEmployee.visibility = View.GONE
        val employeeList = EmployeeData().getEmployeeList()
        if(newText?.isEmpty()!!){
            lstEmployeeItems.adapter = EmployeeAdapter(employeeList)
        }else{
            filteredEmployee.clear()
            for (employee in employeelList){
                if (employee.nama.toLowerCase().contains(newText?.toLowerCase())){
                    filteredEmployee.add(employee)
                }
            }
            if (filteredEmployee.isEmpty()){
                //showing the empty textview when the list is empty
                edSearchEmployee.visibility= View.VISIBLE
            }
            lstEmployeeItems.adapter = filteredAdapter
        }
        return false
    }


}




