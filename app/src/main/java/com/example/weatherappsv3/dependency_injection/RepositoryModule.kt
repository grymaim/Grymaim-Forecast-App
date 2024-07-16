package com.example.weatherappsv3.dependency_injection

import com.example.weatherappsv3.network.repository.WeatherDataRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { WeatherDataRepository(weatherAPI = get()) }
}