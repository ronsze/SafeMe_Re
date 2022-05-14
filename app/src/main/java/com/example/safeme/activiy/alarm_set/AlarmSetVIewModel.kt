package com.example.safeme.activiy.alarm_set

import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AlarmSetVIewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
}