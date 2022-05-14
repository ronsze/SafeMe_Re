package com.example.safeme.activiy.missing_regist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityMissingRegistBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MissingRegistActivity : BaseActivity() {
    private val binding: ActivityMissingRegistBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_missing_regist)
    }

    override val viewModel: MissingRegistViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {

    }
}