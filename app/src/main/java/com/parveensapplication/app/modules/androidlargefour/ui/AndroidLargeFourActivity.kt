package com.parveensapplication.app.modules.androidlargefour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityAndroidLargeFourBinding
import com.parveensapplication.app.modules.androidlargefour.`data`.viewmodel.AndroidLargeFourVM
import com.parveensapplication.app.modules.androidlargeten.ui.AndroidLargeTenActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeFourActivity :
    BaseActivity<ActivityAndroidLargeFourBinding>(R.layout.activity_android_large_four) {
  private val viewModel: AndroidLargeFourVM by viewModels<AndroidLargeFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = AndroidLargeTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
