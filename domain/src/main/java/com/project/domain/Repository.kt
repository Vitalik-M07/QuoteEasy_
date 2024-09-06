package com.project.domain

interface Repository {
    suspend fun loadQuote(): Pair<Boolean, String>
}