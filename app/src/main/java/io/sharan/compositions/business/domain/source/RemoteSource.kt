package io.sharan.compositions.business.domain.source

import io.sharan.compositions.business.domain.service.ApiService
import javax.inject.Inject


/**
 * Created by sharan on 30/01/22.
 */
open class RemoteSource @Inject constructor(private val apiService: ApiService) {
    suspend fun getProfiles() = apiService.getUsers(20)
}