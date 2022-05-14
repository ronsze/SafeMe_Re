package com.example.safeme.activiy.qr_scan

import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityQrscanBinding

class QRScanActivity : BaseActivity() {
    private val binding: ActivityQrscanBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_qrscan)
    }

    override val viewModel: QRScanViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {

    }
}