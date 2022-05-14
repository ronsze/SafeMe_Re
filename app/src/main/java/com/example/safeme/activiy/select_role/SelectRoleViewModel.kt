package com.example.safeme.activiy.select_role

import androidx.lifecycle.LiveData
import com.example.business_model.util.SingleLiveEvent
import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SelectRoleViewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
    private val _selectGuardEvent: SingleLiveEvent<Void> = SingleLiveEvent()
    val selectGuardEvent: LiveData<Void>
        get() = _selectGuardEvent

    private val _selectWardEvent: SingleLiveEvent<Void> = SingleLiveEvent()
    val selectWardEvent: LiveData<Void>
        get() = _selectWardEvent

    fun onClickGuard() {
        _selectGuardEvent.call()
    }

    fun onClickWard() {
        _selectWardEvent.call()
    }
}