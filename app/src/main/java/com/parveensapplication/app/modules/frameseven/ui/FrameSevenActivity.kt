package com.parveensapplication.app.modules.frameseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameSevenBinding
import com.parveensapplication.app.modules.frameeight.ui.FrameEightActivity
import com.parveensapplication.app.modules.frameseven.`data`.viewmodel.FrameSevenVM
import com.parveensapplication.app.modules.framethree.ui.FrameThreeActivity
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.String
import kotlin.Unit

class FrameSevenActivity : BaseActivity<ActivityFrameSevenBinding>(R.layout.activity_frame_seven) {
  private val viewModel: FrameSevenVM by viewModels<FrameSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconmenu.setOnClickListener {
      val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupThirteen.setOnClickListener {
      val destIntent = FrameEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowgroup1452.setOnClickListener {
      val destIntent = FrameThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameSevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
