package com.example.safeme.activiy.select_role

import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivitySelectRoleBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SelectRoleActivity: BaseActivity() {
    private val binding: ActivitySelectRoleBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_select_role)
    }

    override val viewModel: SelectRoleViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {

    }
}