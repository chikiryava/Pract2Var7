package com.example.watchapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userTable")
data class User(
    @PrimaryKey
    val login:String,
    val password:String
)