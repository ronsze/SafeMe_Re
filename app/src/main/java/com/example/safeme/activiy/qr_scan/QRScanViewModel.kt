package com.example.safeme.activiy.qr_scan

import com.example.safeme.base.BaseViewModel
import com.example.safeme.base.CommonComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QRScanViewModel @Inject constructor(
    commonComponent: CommonComponent
): BaseViewModel(commonComponent) {
}