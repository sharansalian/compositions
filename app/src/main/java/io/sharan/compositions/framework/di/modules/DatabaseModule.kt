package io.sharan.compositions.framework.di.modules

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.sharan.compositions.business.domain.AppDatabase
import io.sharan.compositions.business.domain.dao.PersonDao
import javax.inject.Singleton


/**
 * Created by sharan on 30/01/22.
 */
@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase =
        Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "TinderDb"
        ).build()

    @Singleton
    @Provides
    fun providePersonDao(appDatabase: AppDatabase): PersonDao = appDatabase.personDao()
}