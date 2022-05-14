package com.example.safeme.activiy.guard

import androidx.lifecycle.LiveData
import com.example.business_model.util.SingleLiveEvent
import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GuardViewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
    private val _navigateToMap: SingleLiveEvent<Void> = SingleLiveEvent()
    val navigateToMap: LiveData<Void>
        get() = _navigateToMap

    private val _navigateToMissingRegist: SingleLiveEvent<Void> = SingleLiveEvent()
    val navigateToMissingRegist: LiveData<Void>
        get() = _navigateToMissingRegist

    private val _navigateToSetting: SingleLiveEvent<Void> = SingleLiveEvent()
    val navigateToSetting: LiveData<Void>
        get() = _navigateToSetting

    private val _navigateToMissingList: SingleLiveEvent<Void> = SingleLiveEvent()
    val navigateToMissingList: LiveData<Void>
        get() = _navigateToMissingList

    fun onClickMap() {
        _navigateToMap.call()
    }

    fun onClickMissingRegist() {
        _navigateToMissingRegist.call()
    }

    fun onClickSetting() {
        _navigateToSetting.call()
    }

    fun onClickMissingList() {
        _navigateToMissingList.call()
    }
}