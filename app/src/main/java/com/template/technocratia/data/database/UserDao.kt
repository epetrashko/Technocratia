package com.template.technocratia.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.template.technocratia.domain.entities.UserStored

@Dao
interface UserDao {
    @Query("SELECT * FROM UserStored")
    suspend fun getAll(): List<UserStored>

    @Insert
    suspend fun insert(user: UserStored)
}