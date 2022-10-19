package com.example.cleanarchitecture.domain.usecase

import com.example.cleanarchitecture.domain.models.SaveUsernameParam
import com.example.cleanarchitecture.domain.repository.UserRepository

class SaveUsernameUsecase(private val userRepository: UserRepository) {

    fun execute(param: SaveUsernameParam): Boolean {

        val prevUsername = userRepository.getName()

        if(prevUsername.firstName == param.name) {
            return true
        }

        return userRepository.saveName(param)
    }
}