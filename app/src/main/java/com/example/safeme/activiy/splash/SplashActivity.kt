package com.example.safeme.activiy.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.activiy.main.MainActivity
import com.example.safeme.activiy.select_role.SelectRoleActivity
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity: BaseActivity() {
    private val binding: ActivitySplashBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_splash)
    }

    override val viewModel: SplashViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        initView()
        viewModel.checkNavigate()
    }

    override fun observeViewModel() {
        viewModel.navigateToSelectRoleEvent.observe(this) {
            binding.loadingImage.setImageDrawable(resources.getDrawable(R.drawable.load_end))
        }

        viewModel.navigateToMainEvent.observe(this) {
            navigateToMain()
        }
    }

    private fun initView() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.splash_scale_anim)
        binding.loadingImage.startAnimation(anim)
    }

    private fun navigateToSelectRole() {
        val selectRoleIntent = Intent(this, SelectRoleActivity::class.java)
        startActivity(selectRoleIntent)
    }

    private fun navigateToMain() {
        val mainIntent = Intent(this, MainActivity::class.java)
        startActivity(mainIntent)
    }
}