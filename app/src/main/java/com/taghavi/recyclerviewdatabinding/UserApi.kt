package com.taghavi.recyclerviewdatabinding

import com.taghavi.recyclerviewdatabinding.models.User
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {
    @GET("users")
    suspend fun getUserAsync(): Response<List<User>>
}