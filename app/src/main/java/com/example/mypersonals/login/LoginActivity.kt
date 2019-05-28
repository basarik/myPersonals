package com.example.mypersonals.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mypersonals.R
import com.example.mypersonals.base.BaseActivity
import com.example.mypersonals.common.MyPersonalsApplication
import com.example.mypersonals.personal.PersonalsActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), LoginContract.View, View.OnClickListener {

    private lateinit var presenter: LoginPresenter

    override fun onClick(v: View?) {
        when (v) {
            btnLogin -> {
                presenter.login()
            }
            tvSignUp -> {
                Toast.makeText(this, getString(R.string.commigSoon), Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onLogged() {
        startActivity(Intent(this@LoginActivity, PersonalsActivity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = MyPersonalsApplication.instance.presenterFactory.loginPresenter()
        presenter.attach(this)

        btnLogin.setOnClickListener(this)
        tvSignUp.setOnClickListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }
}
