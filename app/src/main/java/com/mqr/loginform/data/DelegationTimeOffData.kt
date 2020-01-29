package com.mqr.loginform.data

import com.mqr.loginform.entity.TimeOffAll
import com.mqr.loginform.entity.TimeOffDelegation

class DelegationTimeOffData{
    fun getDelegationTimeOffList(): MutableList<TimeOffDelegation>{

        val TimeOffDelegationList:MutableList<TimeOffDelegation> = mutableListOf<TimeOffDelegation>()
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))
        TimeOffDelegationList.add(TimeOffAll( "Sakit", "18 Januari 2020- 22 Januari 2020", "Pending"))

        return  TimeOffDelegationList
    }
}
