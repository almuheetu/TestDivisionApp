package com.softzino.testdivisionsapp.model

import com.google.gson.annotations.SerializedName


data class Thana(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)