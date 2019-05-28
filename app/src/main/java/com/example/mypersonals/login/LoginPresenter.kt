package com.example.mypersonals.login

import com.example.mypersonals.base.BasePresenter

class LoginPresenter(private val repository: LoginRepository) : BasePresenter<LoginContract.View>(),
    LoginContract.Presenter, LoginListener {
    override fun onLogged() {
        view?.hideProgress()
        view?.onLogged()
    }

    override fun login() {
        view?.showProgress()
        repository.login(this)
    }
}