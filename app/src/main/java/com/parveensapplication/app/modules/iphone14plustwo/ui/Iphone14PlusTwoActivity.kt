package com.parveensapplication.app.modules.iphone14plustwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityIphone14PlusTwoBinding
import com.parveensapplication.app.modules.androidlargeeight.ui.AndroidLargeEightActivity
import com.parveensapplication.app.modules.androidlargenine.ui.AndroidLargeNineActivity
import com.parveensapplication.app.modules.frameseven.ui.FrameSevenActivity
import com.parveensapplication.app.modules.iphone14plustwo.`data`.viewmodel.Iphone14PlusTwoVM
import kotlin.String
import kotlin.Unit

class Iphone14PlusTwoActivity :
    BaseActivity<ActivityIphone14PlusTwoBinding>(R.layout.activity_iphone_14_plus_two) {
  private val viewModel: Iphone14PlusTwoVM by viewModels<Iphone14PlusTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14PlusTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtPrivacypolicy.setOnClickListener {
      val destIntent = AndroidLargeNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = AndroidLargeEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtOrderdetails.setOnClickListener {
      val destIntent = FrameSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTermAndCondition.setOnClickListener {
      val destIntent = AndroidLargeEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PLUS_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14PlusTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
