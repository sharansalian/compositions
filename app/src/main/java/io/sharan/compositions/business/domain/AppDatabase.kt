package io.sharan.compositions.business.domain

import androidx.room.Database
import androidx.room.RoomDatabase
import io.sharan.compositions.business.domain.dao.PersonDao
import io.sharan.compositions.business.domain.model.Person


/**
 * Created by sharan on 30/01/22.
 */

@Database(entities = [Person::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
}