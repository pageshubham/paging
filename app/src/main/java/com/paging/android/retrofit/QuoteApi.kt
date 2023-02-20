package com.paging.android.retrofit

import com.paging.android.model.QuoteList
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApi {

    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page: Int) : QuoteList
}