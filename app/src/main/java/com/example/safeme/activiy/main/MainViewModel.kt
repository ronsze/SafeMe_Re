package com.example.safeme.activiy.main

import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
}