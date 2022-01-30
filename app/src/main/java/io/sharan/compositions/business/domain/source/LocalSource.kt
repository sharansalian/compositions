package io.sharan.compositions.business.domain.source

import io.sharan.compositions.business.domain.model.Person
import io.sharan.compositions.business.domain.dao.PersonDao
import javax.inject.Inject


/**
 * Created by sharan on 30/01/22.
 */
open class LocalSource @Inject constructor(private val personDao: PersonDao) {
    suspend fun getAllPersons() = personDao.getAll()
    suspend fun savePerson(person: Person) = personDao.insert(person)
}