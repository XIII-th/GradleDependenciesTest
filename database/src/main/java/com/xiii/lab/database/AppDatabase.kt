package com.xiii.lab.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.xiii.lab.database.data.TestEntity

/**
 * @author XIII-th
 * @since 08.06.2019
 */
@Database(entities = [TestEntity::class], version = 1, exportSchema = false)
internal abstract class AppDatabase : RoomDatabase() {

    abstract fun getTestDao(): TestDao
}