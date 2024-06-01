package com.singhtwenty2.data.request

import com.singhtwenty2.data.request.enums.EmploymentStatus
import com.singhtwenty2.data.request.enums.InvestmentExperience
import com.singhtwenty2.data.request.enums.RiskTolerance
import kotlinx.serialization.Serializable

@Serializable
data class KYCDTO(
    val phoneNumber: String,
    val address: String,
    val aadharNumber: String,
    val panNumber: String,
    val employmentStatus: EmploymentStatus,
    val investmentExperience: InvestmentExperience,
    val riskTolerance: RiskTolerance,
    val annualIncome: Int
)
