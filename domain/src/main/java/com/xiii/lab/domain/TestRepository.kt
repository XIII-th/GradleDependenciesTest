package com.xiii.lab.domain

/**
 * @author XIII-th
 * @since 17.07.2019
 */
interface TestRepository {
    fun getAll(): List<TestData>
}