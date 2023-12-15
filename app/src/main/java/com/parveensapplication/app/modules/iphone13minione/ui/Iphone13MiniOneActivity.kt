package com.parveensapplication.app.modules.iphone13minione.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityIphone13MiniOneBinding
import com.parveensapplication.app.modules.androidlargefive.ui.AndroidLargeFiveActivity
import com.parveensapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import com.parveensapplication.app.modules.iphone13minione.`data`.viewmodel.Iphone13MiniOneVM
import kotlin.String
import kotlin.Unit

class Iphone13MiniOneActivity :
    BaseActivity<ActivityIphone13MiniOneBinding>(R.layout.activity_iphone_13_mini_one) {
  private val viewModel: Iphone13MiniOneVM by viewModels<Iphone13MiniOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13MiniOneVM = viewModel
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
    const val TAG: String = "IPHONE13MINI_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13MiniOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
