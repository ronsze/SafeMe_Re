package com.example.safeme.activiy.splash

import androidx.lifecycle.LiveData
import com.example.business_model.util.SingleLiveEvent
import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    commonComponent: CommonComponent,
): BaseViewModel(commonComponent){
    private val _navigateToSelectRoleEvent: SingleLiveEvent<Void> = SingleLiveEvent()
    val navigateToSelectRoleEvent: LiveData<Void>
        get() = _navigateToSelectRoleEvent

    private val _navigateToMainEvent: SingleLiveEvent<Void> = SingleLiveEvent()
    val navigateToMainEvent: LiveData<Void>
        get() = _navigateToMainEvent

    fun checkNavigate() {
        delayLoading()
    }

    private fun delayLoading() {
        Observable.timer(3000, TimeUnit.MILLISECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{ _navigateToSelectRoleEvent.call() }
    }
}