package com.singhtwenty2.data.repository.dao

import com.singhtwenty2.data.dto.request.CompanyExchangeRequestDTO
import com.singhtwenty2.data.dto.response.CompanyExchangeResponseDTO
import com.singhtwenty2.data.repository.entity.CompanyExchanges
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction

object CompanyExchangeDAO {

    fun insertCompanyExchange(requestDTO: CompanyExchangeRequestDTO) {
        return transaction {
            CompanyExchanges.insert {
                it[companyId] = requestDTO.companyId
                it[exchangeId] = requestDTO.exchangeId
            }
        }
    }

    fun getCompanyExchange(companyId: Int): List<CompanyExchangeResponseDTO> {
        return transaction {
            CompanyExchanges.select {
                CompanyExchanges.companyId eq companyId
            }.map {
                CompanyExchangeResponseDTO(
                    id = it[CompanyExchanges.id],
                    companyId = it[CompanyExchanges.companyId],
                    exchangeId = it[CompanyExchanges.exchangeId]
                )
            }
        }
    }
}