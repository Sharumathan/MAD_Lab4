package com.example.dailyevents.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.dailyevents.DailyEvent

@Dao
interface DailyEventDao {
    @Query("SELECT * FROM DAILYEVENT")
    fun getAllEvents():LiveData<List<DailyEvent>>

    @Insert
    fun addDailyEvent(dailyEvent: DailyEvent)

    @Query("Delete FROM DailyEvent where id = :id")
    fun deleteEvent(id:Int)
}