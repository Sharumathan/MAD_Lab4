package com.example.dailyevents

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class DailyEvent(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var priority :Int,
    var title:String,
    var description:String,
    var date:Date,
)