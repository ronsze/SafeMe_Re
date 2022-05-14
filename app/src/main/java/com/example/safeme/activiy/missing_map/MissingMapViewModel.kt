package com.example.safeme.activiy.missing_map

import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MissingMapViewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
}