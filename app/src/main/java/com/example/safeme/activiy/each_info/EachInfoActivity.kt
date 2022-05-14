package com.example.safeme.activiy.each_info

import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityEachInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EachInfoActivity : BaseActivity() {
    private val binding: ActivityEachInfoBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_each_info)
    }

    override val viewModel: EachInfoViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {

    }
}