package com.example.safeme.activiy.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.base.BaseViewModel
import com.example.safeme.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override val viewModel: MainViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {
        TODO("Not yet implemented")
    }
}