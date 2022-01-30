package io.sharan.compositions.business.domain.service

import io.sharan.compositions.business.domain.model.Base
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by sharan on 30/01/22.
 */
interface ApiService {

    @GET("api/")
    suspend fun getUsers(@Query("results") results: Int): Base
}