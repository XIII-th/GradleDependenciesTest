package com.xiii.lab.database.facede.di

import com.xiii.lab.database.di.DatabaseInternalModule
import dagger.Module

/**
 * @author XIII-th
 * @since 17.07.2019
 */
@Module(includes = [DatabaseInternalModule::class])
interface DatabaseModule