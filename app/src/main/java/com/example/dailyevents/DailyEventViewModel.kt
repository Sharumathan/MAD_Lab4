package com.example.dailyevents

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import java.time.Instant
import java.util.Date


class DailyEventViewModel:ViewModel() {

    val dailyEventDao = MainApplicationEvent.dailyEventDatabase.getDailyEventDao()
    val dailyEventList : LiveData<List<DailyEvent>> = dailyEventDao.getAllEvents()


    @RequiresApi(Build.VERSION_CODES.O)
    fun addDailyEvent(priority:Int, title:String, description:String){
        dailyEventDao.addDailyEvent(DailyEvent(priority=priority, title = title, description = description, date = Date.from(
            Instant.now())))
    }

    fun deleteEvent(id:Int){
        dailyEventDao.deleteEvent(id)
    }


}