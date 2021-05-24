package com.example.myapplication.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.myapplication.core.domain.usecase.MovieUseCase

class HomeViewModel(movieUseCase: MovieUseCase): ViewModel() {
    val movie = movieUseCase.getAllMovie().asLiveData()
}