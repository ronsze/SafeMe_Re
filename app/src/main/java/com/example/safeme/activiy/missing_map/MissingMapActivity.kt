package com.example.safeme.activiy.missing_map

import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityMissingMapBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MissingMapActivity : BaseActivity() {
    private val binding: ActivityMissingMapBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_missing_map)
    }

    override val viewModel: MissingMapViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {

    }
}