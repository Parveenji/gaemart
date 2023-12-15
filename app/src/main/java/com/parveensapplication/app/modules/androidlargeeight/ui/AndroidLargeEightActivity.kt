package com.parveensapplication.app.modules.androidlargeeight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityAndroidLargeEightBinding
import com.parveensapplication.app.modules.androidlargeeight.`data`.viewmodel.AndroidLargeEightVM
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeEightActivity :
    BaseActivity<ActivityAndroidLargeEightBinding>(R.layout.activity_android_large_eight) {
  private val viewModel: AndroidLargeEightVM by viewModels<AndroidLargeEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeEightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
