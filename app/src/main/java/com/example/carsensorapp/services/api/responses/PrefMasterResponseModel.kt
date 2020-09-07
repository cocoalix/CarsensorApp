package com.example.carsensorapp.services.api.responses

import com.example.carsensorapp.services.api.CodeNamePair

data class PrefMasterResponseModel(
    val api_version: Float,
    val results_available: Int,
    val results_returned: Int,
    val results_start: Int,
    val pref: List<PrefModel>
)

data class PrefModel (
    val code: String,
    val name: String,
    val large_area: CodeNamePair
)
