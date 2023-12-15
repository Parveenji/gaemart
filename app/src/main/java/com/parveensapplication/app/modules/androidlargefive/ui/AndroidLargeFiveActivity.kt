package com.parveensapplication.app.modules.androidlargefive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityAndroidLargeFiveBinding
import com.parveensapplication.app.modules.androidlargefive.`data`.viewmodel.AndroidLargeFiveVM
import com.parveensapplication.app.modules.framefourteen.ui.FrameFourteenActivity
import com.parveensapplication.app.modules.frameone.ui.FrameOneActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeFiveActivity :
    BaseActivity<ActivityAndroidLargeFiveBinding>(R.layout.activity_android_large_five) {
  private val viewModel: AndroidLargeFiveVM by viewModels<AndroidLargeFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = FrameOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = FrameFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
