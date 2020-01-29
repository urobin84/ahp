package com.mqr.loginform.data

import com.mqr.loginform.entity.Notification

class NotificationData(){
    fun getNotificationList(): MutableList<Notification>{
        val avatar = "https://cdn2.tstatic.net/style/foto/bank/images/rio-haryanto_20170817_190811.jpg"
        val NotificationList:MutableList<Notification> = mutableListOf<Notification>()

        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))
        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))
        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))
        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))
        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))
        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))
        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))
        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))
        NotificationList.add(Notification(avatar, "Kurnia Prasasti Raharjo", "lorewm ojhk kjahbksd kljbkjasd kjbkafdsg kjhbkadfjggn kjbgf kjh ujhkjhasdbf knk ka k ", "17 jan 2020 08:36 AM"))

        return NotificationList
    }
}