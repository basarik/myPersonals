package com.example.mypersonals.common

import com.example.mypersonals.login.LoginPresenter
import com.example.mypersonals.login.LoginRepository
import com.example.mypersonals.login.LoginRepositoryImpl

open class PresenterFactory {
    open fun loginRepository(): LoginRepository = LoginRepositoryImpl()
    fun loginPresenter(): LoginPresenter = LoginPresenter(loginRepository())
}