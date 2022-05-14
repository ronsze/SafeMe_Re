package com.example.safeme.activiy.ward

import androidx.lifecycle.LiveData
import com.example.business_model.util.SingleLiveEvent
import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WardViewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
    private val _navigateToSetting: SingleLiveEvent<Void> = SingleLiveEvent()
    val navigateToSetting: LiveData<Void>
        get() = _navigateToSetting

    private val _navigateToMissingList: SingleLiveEvent<Void> = SingleLiveEvent()
    val navigateToMissingList: LiveData<Void>
        get() = _navigateToMissingList

    fun onClickSetting() {
        _navigateToSetting.call()
    }

    fun onClickMissingList() {
        _navigateToMissingList.call()
    }
}