package com.singhtwenty2.data.request

import com.singhtwenty2.data.request.enums.Gender
import kotlinx.serialization.Serializable

@Serializable
data class SignupRequestDTO(
    val userId: Int? = null,
    val name: String,
    val email: String,
    val age: Int,
    val gender: Gender,
    val password: String
)
