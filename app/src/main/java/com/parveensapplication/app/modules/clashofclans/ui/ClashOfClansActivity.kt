package com.parveensapplication.app.modules.clashofclans.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityClashOfClansBinding
import com.parveensapplication.app.modules.androidlargefive.ui.AndroidLargeFiveActivity
import com.parveensapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import com.parveensapplication.app.modules.clashofclans.`data`.viewmodel.ClashOfClansVM
import kotlin.String
import kotlin.Unit

class ClashOfClansActivity :
    BaseActivity<ActivityClashOfClansBinding>(R.layout.activity_clash_of_clans) {
  private val viewModel: ClashOfClansVM by viewModels<ClashOfClansVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.clashOfClansVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBack.setOnClickListener {
      val destIntent = AndroidLargeTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = AndroidLargeFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CLASH_OF_CLANS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ClashOfClansActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
