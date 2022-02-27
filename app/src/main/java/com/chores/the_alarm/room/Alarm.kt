package com.chores.the_alarm.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Alarm (
    @PrimaryKey (autoGenerate = true)
    val id: Int,
    val time: String,
    val date: String,
    val note: String,
    val type: Int
)