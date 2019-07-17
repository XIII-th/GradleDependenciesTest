package com.xiii.lab.database

import androidx.room.Dao
import androidx.room.Query
import com.xiii.lab.database.data.TestEntity

/**
 * @author XIII-th
 * @since 17.07.2019
 */
@Dao
internal interface TestDao {
    @Query("SELECT * FROM test")
    fun getAll(): List<TestEntity>
}