package com.project.data

import retrofit2.Call
import retrofit2.http.GET

interface AnimeQuoteService {
    //https://zenquotes.io/api/today
    @GET("api/today")

   suspend fun animeQuote(): AnimeQuoteCloud
}