package com.paging.android.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.paging.android.paging.QuotePagingSource
import com.paging.android.retrofit.QuoteApi
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val quoteApi: QuoteApi) {

    fun getQuotes() = Pager(
        config = PagingConfig(pageSize = 20, maxSize = 100),
        pagingSourceFactory = { QuotePagingSource(quoteApi)}
    ).liveData

}