package com.example.safeme.activiy.guard

import android.content.Intent
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.activiy.map.MapActivity
import com.example.safeme.activiy.missing_list.MissingListActivity
import com.example.safeme.activiy.missing_regist.MissingRegistActivity
import com.example.safeme.activiy.setting.SettingActivity
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityGuardBinding

import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

@AndroidEntryPoint
class GuardActivity: BaseActivity() {
    private val binding: ActivityGuardBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_guard)
    }
    override val viewModel: GuardViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {
        viewModel.navigateToMap.observe(this) {
            navigateToMap()
        }

        viewModel.navigateToMissingRegist.observe(this) {
            val anim = AnimationUtils.loadAnimation(this, R.anim.swing_anim)
            binding.missingRegistIcon.startAnimation(anim)
            timerNavigate({ navigateToMissingRegist() }, 700)
        }

        viewModel.navigateToSetting.observe(this) {
            val anim = AnimationUtils.loadAnimation(this, R.anim.setting_rotate_anim)
            binding.settingIcon.startAnimation(anim)
            timerNavigate({ navigateToSetting() }, 1200)
        }

        viewModel.navigateToMissingList.observe(this) {
            navigateToMissingList()
        }
    }

    private fun navigateToMap() {
        val mapIntent = Intent(this, MapActivity::class.java)
        startActivity(mapIntent)
    }

    private fun navigateToMissingRegist() {
        val missingRegistIntent = Intent(this, MissingRegistActivity::class.java)
        startActivity(missingRegistIntent)
    }

    private fun navigateToSetting() {
        val settingIntent = Intent(this, SettingActivity::class.java)
        startActivity(settingIntent)
    }

    private fun navigateToMissingList() {
        val missingListIntent = Intent(this, MissingListActivity::class.java)
        startActivity(missingListIntent)
    }
}