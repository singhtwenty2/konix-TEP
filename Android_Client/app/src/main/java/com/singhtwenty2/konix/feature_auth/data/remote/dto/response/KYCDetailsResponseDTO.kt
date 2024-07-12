package com.singhtwenty2.konix.feature_auth.data.remote.dto.response

data class KYCDetailsResponseDTO(
    val phoneNumber: String,
    val address: String,
    val aadharNumber: String,
    val panNumber: String,
    val employmentStatus: String,
    val investmentExperience: String,
    val riskTolerance: String,
    val annualIncome: Int
)
