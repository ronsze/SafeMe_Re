package com.example.safeme.activiy.missing_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityMissingListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MissingListActivity : BaseActivity() {
    private val binding: ActivityMissingListBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_missing_list)
    }

    override val viewModel: MissingListViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {

    }
}