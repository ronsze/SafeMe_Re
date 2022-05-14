package com.example.safeme.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()
        observeViewModel()
    }
    abstract val viewModel: BaseViewModel

    abstract fun initDataBinding()
    abstract fun observeViewModel()

    protected fun timerNavigate(navigateFun: () -> Unit, timeMills: Long) {
        Observable.timer(timeMills, TimeUnit.MILLISECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { navigateFun() }
    }
}