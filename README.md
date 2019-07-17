### Problem
We have compilation error:
```
Supertypes of the following classes cannot be resolved. Please make sure you have the required dependencies in the classpath:
    class com.xiii.lab.database.AppDatabase, unresolved supertypes: androidx.room.RoomDatabase
```

### Delais
- All implementations in *database* module are *internal*. Only [DatabaseModule](https://github.com/XIII-th/GradleDependenciesTest/blob/master/database/src/main/java/com/xiii/lab/database/facede/di/DatabaseModule.kt) is used as public API
- Module *app* works only with interfaces from *domain* module. All implementations should be provided from dagger modules in [AppComponent](https://github.com/XIII-th/GradleDependenciesTest/blob/master/app/src/main/java/com/xiii/lab/gradledependenciestest/di/AppComponent.kt)
- Module *database* depends on RoomDatabase and include this dependency as *implementation*

### Solution
Issue can be solved by changing
```gradle
implementation "androidx.room:room-runtime:$room_version"
```
to
```gradle
api "androidx.room:room-runtime:$room_version"
```
but this solution is not appropriate. Module *app* should knows nothing about implementation details of *database* module
