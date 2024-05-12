package com.example.dailyevents.Dao

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dailyevents.DailyEvent
import com.example.dailyevents.DateConverter

@Database(entities = [DailyEvent::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class DailyEventDatabase :RoomDatabase(){
    companion object{
        const val NAME = "DailyEvent_DB"
    }
    abstract fun getDailyEventDao() : DailyEventDao

}