package com.captain.buzznews.api

import com.captain.buzznews.BuildConfig
import com.captain.buzznews.model.NewsSourceResponse
import retrofit2.http.GET

interface NewsService {

    @GET("articles?source=google-news&apiKey=${BuildConfig.NEWS_API_KEY}")
    suspend fun getNewsFromGoogle():NewsSourceResponse


}