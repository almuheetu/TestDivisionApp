package com.softzino.testdivisionsapp.repositories


import com.softzino.testdivisionsapp.model.DivisionResponse
import com.softzino.testdivisionsapp.networks.ApiClient
import com.softzino.testdivisionsapp.networks.ApiInterface

class DivisionRepository() {
    suspend fun getDivisions(): DivisionResponse? {
        val divisionApi = ApiClient.getInstance().create(ApiInterface::class.java)
        return divisionApi.getDivision().body()

    }

}