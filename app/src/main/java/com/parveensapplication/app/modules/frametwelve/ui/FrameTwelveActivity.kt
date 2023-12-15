package com.parveensapplication.app.modules.frametwelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameTwelveBinding
import com.parveensapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import com.parveensapplication.app.modules.frameeleven.ui.FrameElevenActivity
import com.parveensapplication.app.modules.frametwelve.`data`.viewmodel.FrameTwelveVM
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameTwelveActivity : BaseActivity<ActivityFrameTwelveBinding>(R.layout.activity_frame_twelve)
    {
  private val viewModel: FrameTwelveVM by viewModels<FrameTwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumn.setOnClickListener {
      val destIntent = FrameElevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackrectanglesix.setOnClickListener {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_TWELVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameTwelveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
