package com.parveensapplication.app.modules.framenine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameNineBinding
import com.parveensapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import com.parveensapplication.app.modules.frameeight.ui.FrameEightActivity
import com.parveensapplication.app.modules.framenine.`data`.viewmodel.FrameNineVM
import com.parveensapplication.app.modules.frameten.ui.FrameTenActivity
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameNineActivity : BaseActivity<ActivityFrameNineBinding>(R.layout.activity_frame_nine) {
  private val viewModel: FrameNineVM by viewModels<FrameNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancelOrder.setOnClickListener {
      val destIntent = FrameEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackrectanglesix.setOnClickListener {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSendDetails.setOnClickListener {
      val destIntent = FrameTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameNineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
