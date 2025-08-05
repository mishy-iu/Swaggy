package com.mitchelle.swaggy.repository

import com.mitchelle.swaggy.data.UserDao
import com.mitchelle.swaggy.model.User


class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}