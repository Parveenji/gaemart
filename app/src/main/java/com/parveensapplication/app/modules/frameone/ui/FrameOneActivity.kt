package com.parveensapplication.app.modules.frameone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityFrameOneBinding
import com.parveensapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.parveensapplication.app.modules.clashofclans.ui.ClashOfClansActivity
import com.parveensapplication.app.modules.frameone.`data`.viewmodel.FrameOneVM
import com.parveensapplication.app.modules.iphone13minitwo.ui.Iphone13MiniTwoActivity
import kotlin.String
import kotlin.Unit

class FrameOneActivity : BaseActivity<ActivityFrameOneBinding>(R.layout.activity_frame_one) {
  private val viewModel: FrameOneVM by viewModels<FrameOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSixteen.setOnClickListener {
      val destIntent = AndroidLargeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = AndroidLargeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleNineteen.setOnClickListener {
      val destIntent = ClashOfClansActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyThree.setOnClickListener {
      val destIntent = Iphone13MiniTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyFour.setOnClickListener {
      val destIntent = Iphone13MiniTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
