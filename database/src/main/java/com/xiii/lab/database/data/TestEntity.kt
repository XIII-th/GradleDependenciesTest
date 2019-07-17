package com.xiii.lab.database.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.xiii.lab.domain.TestData

/**
 * @author XIII-th
 * @since 07.06.2019
 */
@Entity(tableName = "test")
internal data class TestEntity(
    @PrimaryKey
    override val id: Int
) : TestData