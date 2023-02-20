package com.paging.android.di

import com.paging.android.retrofit.QuoteApi
import com.paging.android.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun getQuoteApi() : QuoteApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuoteApi::class.java)
    }

    /*@Singleton
    @Provides
    fun getQuoteApi(retrofit: Retrofit) : QuoteApi {
        return retrofit.create(QuoteApi::class.java)
    }*/
}