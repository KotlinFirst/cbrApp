package com.example.cbrapp.data.api

import com.example.cbrapp.data.Valute
import retrofit2.http.GET

interface ApiService {

    @GET("daily_json.js")
    fun getValute(): List<Valute>
}