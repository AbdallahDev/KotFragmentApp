package com.example.user.kotfragmentapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UserAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        var tr = fragmentManager.beginTransaction()
        var obj = LoginFragment()
        tr.replace(R.id.container, obj)
        tr.commit()

    }

    fun su(v: View) {
        var tr = fragmentManager.beginTransaction()
        var obj = RegFragment()
        tr.replace(R.id.container, obj)
        tr.commit()
    }
}
