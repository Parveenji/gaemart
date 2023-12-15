package com.parveensapplication.app.modules.framefifteen.ui

import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameFifteenBinding
import com.parveensapplication.app.modules.framefifteen.`data`.viewmodel.FrameFifteenVM
import com.parveensapplication.app.modules.framesixteen.ui.FrameSixteenActivity
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameFifteenActivity :
    BaseActivity<ActivityFrameFifteenBinding>(R.layout.activity_frame_fifteen) {
  private val viewModel: FrameFifteenVM by viewModels<FrameFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnhome.setOnClickListener {
      val destIntent = FrameSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_FIFTEEN_ACTIVITY"

  }
}
