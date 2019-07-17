package com.xiii.lab.gradledependenciestest

import com.xiii.lab.gradledependenciestest.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * @author XIII-th
 * @since 08.06.2019
 */
class TestApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .appContext(this)
            .build()
    }
}