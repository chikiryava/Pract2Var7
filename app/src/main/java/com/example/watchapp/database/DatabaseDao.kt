package com.example.watchapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDao {
    @Insert
    fun insert(user:User)

    @Query("SELECT * FROM your_entity_table Where login=:login")
    fun getAllEntities(login:String): User
}