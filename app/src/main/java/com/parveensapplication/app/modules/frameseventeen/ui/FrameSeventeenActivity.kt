package com.parveensapplication.app.modules.frameseventeen.ui

import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameSeventeenBinding
import com.parveensapplication.app.modules.frameeighteen.ui.FrameEighteenActivity
import com.parveensapplication.app.modules.frameseventeen.`data`.viewmodel.FrameSeventeenVM
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameSeventeenActivity :
    BaseActivity<ActivityFrameSeventeenBinding>(R.layout.activity_frame_seventeen) {
  private val viewModel: FrameSeventeenVM by viewModels<FrameSeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameSeventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnvector.setOnClickListener {
      val destIntent = FrameEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_SEVENTEEN_ACTIVITY"

  }
}
