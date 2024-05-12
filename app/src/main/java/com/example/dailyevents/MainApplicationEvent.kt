package com.example.dailyevents

import android.app.Application
import androidx.room.Room
import com.example.dailyevents.Dao.DailyEventDatabase

class MainApplicationEvent:Application() {
    companion object{
        lateinit var dailyEventDatabase:DailyEventDatabase
    }

    override fun onCreate() {
        super.onCreate()
        dailyEventDatabase =  Room.databaseBuilder(
            applicationContext,
            DailyEventDatabase::class.java,
            DailyEventDatabase.NAME
        ).build()
    }
}