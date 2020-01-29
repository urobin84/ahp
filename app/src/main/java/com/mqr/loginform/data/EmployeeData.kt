package com.mqr.loginform.data

import com.mqr.loginform.entity.Employee

class EmployeeData(){
    fun getEmployeeList(): MutableList<Employee>{
        val avatar = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val EmployeeList:MutableList<Employee> = mutableListOf<Employee>()

        EmployeeList.add(Employee(avatar, "1", "Kurnia Prasasti Raharjo", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Budi Suseno", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Kurnia Prasasti Raharjo", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Adam Yusuf", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Kurnia Prasasti Raharjo", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Dede Priyatna", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Kurnia Prasasti Raharjo", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Sari kasih", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Kurnia Prasasti Raharjo", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Bintang Ananta", "Manager","a@gmail.com", "08226006099"))
        EmployeeList.add(Employee(avatar, "1", "Kurnia Prasasti Raharjo", "Manager","a@gmail.com", "08226006099"))

        return EmployeeList
    }
}