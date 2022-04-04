package com.example.exchangerates.data.repository

import com.example.exchangerates.data.api.RetrofitInstance
import com.example.exchangerates.model.cash.Cash
import com.example.exchangerates.model.cashless.Cashless
import retrofit2.Response

class Repository {
    suspend fun getCashMoney(): Response<Cash> {
        return RetrofitInstance.api.getCash()
    }

    suspend fun getCashlessMoney(): Response<Cashless> {
        return RetrofitInstance.api.getCashless()
    }
}