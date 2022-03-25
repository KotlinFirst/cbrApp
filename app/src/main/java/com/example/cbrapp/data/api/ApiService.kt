package com.example.cbrapp.data.api

import com.example.cbrapp.data.ExampleJson
import com.example.cbrapp.data.Valute
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ApiService {

    @GET("daily_json.js")
    fun getValute(): Single<ExampleJson>
}