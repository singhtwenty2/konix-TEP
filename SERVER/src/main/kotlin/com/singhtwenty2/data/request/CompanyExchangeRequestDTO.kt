package com.singhtwenty2.data.request

import kotlinx.serialization.Serializable

@Serializable
data class CompanyExchangeRequestDTO(
    val companyId: Int,
    val exchangeId: Int
)
