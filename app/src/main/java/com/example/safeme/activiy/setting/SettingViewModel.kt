package com.example.safeme.activiy.setting

import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingViewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
}