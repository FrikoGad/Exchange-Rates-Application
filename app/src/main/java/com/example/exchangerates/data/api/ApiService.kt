package com.example.exchangerates.data.api

import com.example.exchangerates.model.cash.Cash
import com.example.exchangerates.model.cashless.Cashless
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCash(): Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getCashless(): Response<Cashless>
}