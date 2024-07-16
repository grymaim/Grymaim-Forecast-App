package com.example.weatherappsv3.dependency_injection

import com.example.weatherappsv3.storage.SharedPreferencesManager
import org.koin.dsl.module

val storageModule = module {
    single { SharedPreferencesManager(context = get(), gson = get()) }
}