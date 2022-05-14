package com.example.safeme.activiy.missing_info


import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityMissingInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MissingInfoActivity : BaseActivity() {
    private val binding: ActivityMissingInfoBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_missing_info)
    }

    override val viewModel: MissingInfoViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {

    }
}