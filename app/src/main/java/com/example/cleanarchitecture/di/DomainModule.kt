package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.domain.usecase.GetUsernameUsecase
import com.example.cleanarchitecture.domain.usecase.SaveUsernameUsecase
import org.koin.dsl.module


val domainModule = module {

    factory<GetUsernameUsecase> {
        GetUsernameUsecase(userRepository = get())
    }

    factory<SaveUsernameUsecase> {
        SaveUsernameUsecase(userRepository = get())
    }

}