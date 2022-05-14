package com.example.safeme.activiy.ward

import android.content.Intent
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.safeme.R
import com.example.safeme.activiy.missing_list.MissingListActivity
import com.example.safeme.activiy.setting.SettingActivity
import com.example.safeme.base.BaseActivity
import com.example.safeme.databinding.ActivityWardBinding
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

@AndroidEntryPoint
class WardActivity: BaseActivity() {
    private val binding: ActivityWardBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_ward)
    }
    override val viewModel: WardViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {
        viewModel.navigateToSetting.observe(this) {
            val anim = AnimationUtils.loadAnimation(this, R.anim.setting_rotate_anim)
            binding.settingIcon.startAnimation(anim)
            timerNavigate({ navigateToSetting() }, 1200)
        }

        viewModel.navigateToMissingList.observe(this) {
            navigateToMissingList()
        }
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