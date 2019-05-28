package com.example.mypersonals.base

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mypersonals.R

open class BaseActivity : AppCompatActivity(), BaseView {

    private lateinit var loading: ProgressDialog

    override fun showProgress() {
        loading.show()
    }

    override fun hideProgress() {
        loading.hide()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loading = ProgressDialog(this)
        loading.setMessage(getString(R.string.progressDialog))
    }
}