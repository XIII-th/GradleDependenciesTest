package com.xiii.lab.database.di

import android.content.Context
import androidx.room.Room
import com.xiii.lab.database.AppDatabase
import com.xiii.lab.domain.TestData
import com.xiii.lab.domain.TestRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author XIII-th
 * @since 08.06.2019
 */
@Module
internal class DatabaseInternalModule {

    @Singleton
    @Provides
    fun initDatabase(context: Context) = Room.databaseBuilder(context, AppDatabase::class.java, "test.db").build()

    @Provides
    fun getRouteDao(db: AppDatabase): TestRepository = object : TestRepository {
        override fun getAll(): List<TestData> = db.getTestDao().getAll()
    }
}