package com.xiii.lab.gradledependenciestest.di.injectors

import com.xiii.lab.gradledependenciestest.MainActivity
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector

/**
 * @author XIII-th
 * @since 08.06.2019
 */
@Module(includes = [AndroidInjectionModule::class])
interface AppInjectorModule {

    @ContributesAndroidInjector
    fun getMainActivityInjector(): MainActivity
}