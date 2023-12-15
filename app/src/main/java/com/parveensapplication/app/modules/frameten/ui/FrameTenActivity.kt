package com.parveensapplication.app.modules.frameten.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameTenBinding
import com.parveensapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import com.parveensapplication.app.modules.frameten.`data`.viewmodel.FrameTenVM
import com.parveensapplication.app.modules.frametwelve.ui.FrameTwelveActivity
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameTenActivity : BaseActivity<ActivityFrameTenBinding>(R.layout.activity_frame_ten) {
  private val viewModel: FrameTenVM by viewModels<FrameTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumn.setOnClickListener {
      val destIntent = FrameTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackrectanglesix.setOnClickListener {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_TEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameTenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
