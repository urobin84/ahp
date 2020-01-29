package com.mqr.loginform.data

import com.mqr.loginform.entity.TimeOffAll

class AllTimeOffData{
    fun getAllTimeOffList(): MutableList<TimeOffAll>{

        val TimeOffAllList:MutableList<TimeOffAll> = mutableListOf<TimeOffAll>()
        TimeOffAllList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Cuti Istimewa", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Cuti Istimewa", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Cuti Istimewa", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffAllList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))

        return  TimeOffAllList
    }
}
