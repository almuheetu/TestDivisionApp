package com.softzino.testdivisionsapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class District(
    @SerializedName("division_id")
    val divisionId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("thana")
    val thanas: List<Thana>
): Serializable