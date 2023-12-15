package com.parveensapplication.app.modules.frameeleven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameElevenBinding
import com.parveensapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import com.parveensapplication.app.modules.frameeleven.`data`.viewmodel.FrameElevenVM
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameElevenActivity : BaseActivity<ActivityFrameElevenBinding>(R.layout.activity_frame_eleven)
    {
  private val viewModel: FrameElevenVM by viewModels<FrameElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
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
    const val TAG: String = "FRAME_ELEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameElevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
