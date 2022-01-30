package io.sharan.compositions.business.domain

import io.sharan.compositions.business.domain.model.Person
import io.sharan.compositions.business.domain.source.LocalSource
import io.sharan.compositions.business.domain.source.RemoteSource
import javax.inject.Inject


/**
 * Created by sharan on 30/01/22.
 */
open class Repository @Inject constructor(
    private val localSource: LocalSource,
    private val remoteSource: RemoteSource
) {
    suspend fun getTinderProfiles() = remoteSource.getProfiles()
    suspend fun savePersonProfile(person: Person) = localSource.savePerson(person)
    suspend fun getFavouriteProfiles() = localSource.getAllPersons()
}