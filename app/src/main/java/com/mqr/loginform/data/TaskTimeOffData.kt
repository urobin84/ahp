package com.mqr.loginform.data

import com.mqr.loginform.entity.TimeOffTask

class TaskTimeOffData{
    fun getTaskTimeOffList(): MutableList<TimeOffTask>{

        val TimeOffTaskList:MutableList<TimeOffTask> = mutableListOf<TimeOffTask>()
        TimeOffTaskList.add(TimeOffTask( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Cuti Istimewa", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Cuti Istimewa", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Cuti Istimewa", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffTaskList.add(TimeOffTask( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))

        return  TimeOffTaskList
    }
}
