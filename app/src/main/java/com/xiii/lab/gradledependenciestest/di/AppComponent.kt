package com.xiii.lab.gradledependenciestest.di

import android.content.Context
import com.xiii.lab.database.facede.di.DatabaseModule
import com.xiii.lab.gradledependenciestest.TestApplication
import com.xiii.lab.gradledependenciestest.di.injectors.AppInjectorModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * @author XIII-th
 * @since 08.06.2019
 */
@Singleton
@Component(
    modules = [
        AppInjectorModule::class,
        DatabaseModule::class
    ]
)
interface AppComponent : AndroidInjector<TestApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun appContext(context: Context): Builder
        fun build(): AppComponent
    }
}