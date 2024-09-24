package com.softzino.testdivisionsapp.networks

import com.softzino.testdivisionsapp.model.DivisionResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("division")
    suspend fun getDivision():Response<DivisionResponse>

}