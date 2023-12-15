package com.parveensapplication.app.modules.frameeight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameEightBinding
import com.parveensapplication.app.modules.frameeight.`data`.viewmodel.FrameEightVM
import com.parveensapplication.app.modules.framefourteen.ui.FrameFourteenActivity
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameEightActivity : BaseActivity<ActivityFrameEightBinding>(R.layout.activity_frame_eight) {
  private val viewModel: FrameEightVM by viewModels<FrameEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackvector.setOnClickListener {
      val destIntent = FrameFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameEightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
