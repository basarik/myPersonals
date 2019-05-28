package com.example.mypersonals.login

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginRepositoryImpl : LoginRepository {
    override fun login(listener: LoginListener) {
        GlobalScope.launch(context = Dispatchers.Main) {
            delay(1000)
            listener.onLogged()
        }
    }
}

interface LoginRepository {
    fun login(listener: LoginListener)
}

interface LoginListener {
    fun onLogged()
}