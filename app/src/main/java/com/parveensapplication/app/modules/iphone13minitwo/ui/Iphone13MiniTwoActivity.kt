package com.parveensapplication.app.modules.iphone13minitwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityIphone13MiniTwoBinding
import com.parveensapplication.app.modules.androidlargefive.ui.AndroidLargeFiveActivity
import com.parveensapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import com.parveensapplication.app.modules.iphone13minitwo.`data`.viewmodel.Iphone13MiniTwoVM
import kotlin.String
import kotlin.Unit

class Iphone13MiniTwoActivity :
    BaseActivity<ActivityIphone13MiniTwoBinding>(R.layout.activity_iphone_13_mini_two) {
  private val viewModel: Iphone13MiniTwoVM by viewModels<Iphone13MiniTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13MiniTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = AndroidLargeFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBack.setOnClickListener {
      val destIntent = AndroidLargeTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13MINI_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13MiniTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
