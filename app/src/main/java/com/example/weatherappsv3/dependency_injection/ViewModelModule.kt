package com.example.weatherappsv3.dependency_injection

import com.example.weatherappsv3.fragments.home.HomeViewModel
import com.example.weatherappsv3.fragments.location.LocationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(weatherDataRepository = get()) }
    viewModel { LocationViewModel(weatherDataRepository = get()) }
}