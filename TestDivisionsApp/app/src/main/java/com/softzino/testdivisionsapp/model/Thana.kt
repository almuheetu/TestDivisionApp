package com.softzino.testdivisionsapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Thana(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)