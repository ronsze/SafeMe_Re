package com.example.safeme.activiy.select_role

import android.content.Intent
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.activiy.guard.GuardActivity
import com.example.safeme.activiy.ward.WardActivity
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivitySelectRoleBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SelectRoleActivity: BaseActivity() {
    private val binding: ActivitySelectRoleBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_select_role)
    }

    override val viewModel: SelectRoleViewModel by viewModels()
    private lateinit var selectRoleScaleAnim: Animation

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        selectRoleScaleAnim = AnimationUtils.loadAnimation(this, R.anim.select_role_anim)
    }

    override fun observeViewModel() {
        viewModel.selectGuardEvent.observe(this) {
            binding.guardImage.startAnimation(selectRoleScaleAnim)
            timerNavigate({ navigateToGuardActivity() }, 300)
        }

        viewModel.selectWardEvent.observe(this) {
            binding.wardImage.startAnimation(selectRoleScaleAnim)
            timerNavigate({ navigateToWardActivity() }, 300)
        }
    }

    private fun navigateToGuardActivity() {
        val guardActivityIntent = Intent(this, GuardActivity::class.java)
        startActivity(guardActivityIntent)
        overridePendingTransition(R.anim.fade_in_top_anim, R.anim.slide_top_bottom_anim)
        finish()
    }

    private fun navigateToWardActivity() {
        val wardActivityIntent = Intent(this, WardActivity::class.java)
        startActivity(wardActivityIntent)
        overridePendingTransition(R.anim.fade_in_bottom_anim, R.anim.slide_bottom_top_anim)
        finish()
    }
}