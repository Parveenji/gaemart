package com.parveensapplication.app.modules.framefourteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameFourteenBinding
import com.parveensapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import com.parveensapplication.app.modules.frameeight.ui.FrameEightActivity
import com.parveensapplication.app.modules.framefourteen.`data`.viewmodel.FrameFourteenVM
import com.parveensapplication.app.modules.framenine.ui.FrameNineActivity
import com.parveensapplication.app.modules.frameten.ui.FrameTenActivity
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameFourteenActivity :
    BaseActivity<ActivityFrameFourteenBinding>(R.layout.activity_frame_fourteen) {
  private val viewModel: FrameFourteenVM by viewModels<FrameFourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackrectanglesix.setOnClickListener {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etGroup9006.setOnClickListener {
      val destIntent = FrameTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackiconmenu.setOnClickListener {
      val destIntent = FrameNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCancelOrder.setOnClickListener {
      val destIntent = FrameEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_FOURTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameFourteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
