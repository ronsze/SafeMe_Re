package com.example.safeme.activiy.each_info

import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EachInfoViewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
}