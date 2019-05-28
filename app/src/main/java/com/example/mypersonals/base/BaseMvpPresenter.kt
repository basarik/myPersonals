package com.example.mypersonals.base

interface BaseMvpPresenter<in T : BaseView> {
    fun attach(baseView: T)

    fun detach()
}