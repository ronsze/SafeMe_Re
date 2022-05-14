package com.example.safeme.activiy.alarm_set

import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityAlarmSetBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlarmSetActivity : BaseActivity() {
    private val binding: ActivityAlarmSetBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_alarm_set)
    }

    override val viewModel: AlarmSetVIewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {

    }
}