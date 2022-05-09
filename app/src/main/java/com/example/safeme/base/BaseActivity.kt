package com.example.safeme.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()
        observeViewModel()
    }
    abstract val viewModel: BaseViewModel

    abstract fun initDataBinding()
    abstract fun observeViewModel()
}