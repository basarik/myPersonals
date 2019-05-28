package com.example.mypersonals.login

import com.example.mypersonals.base.BaseMvpPresenter
import com.example.mypersonals.base.BaseView

interface LoginContract {

    interface View : BaseView {
        fun onLogged()
    }

    interface Presenter : BaseMvpPresenter<View> {
        fun login()
    }
}