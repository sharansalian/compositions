package io.sharan.compositions.business.domain.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import io.sharan.compositions.business.domain.model.Person


/**
 * Created by sharan on 30/01/22.
 */
@Dao
abstract class PersonDao {

    @Query("SELECT * FROM person")
    abstract suspend fun getAll(): List<Person>

    @Insert
    abstract suspend fun insert(person: Person): Long

}