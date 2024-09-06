package com.project.quoteeasy

import android.app.Application
import com.project.data.RepositoryImpl
import com.project.domain.Repository
import com.project.presentation.MainViewModel
import com.project.presentation.ProviderViewModel

class QuoteEasyApp: Application(), ProviderViewModel {
    private lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        val repository: Repository = RepositoryImpl()
        viewModel= MainViewModel(repository = repository)
    }

    override fun viewModel(): MainViewModel {
    }
}