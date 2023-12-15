package com.parveensapplication.app.modules.androidlargethree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.appcomponents.googleauth.GoogleHelper
import com.parveensapplication.app.databinding.ActivityAndroidLargeThreeBinding
import com.parveensapplication.app.modules.androidlargethree.`data`.viewmodel.AndroidLargeThreeVM
import kotlin.String
import kotlin.Unit

class AndroidLargeThreeActivity :
    BaseActivity<ActivityAndroidLargeThreeBinding>(R.layout.activity_android_large_three) {
  private val viewModel: AndroidLargeThreeVM by viewModels<AndroidLargeThreeVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeThreeVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowloginmethods.setOnClickListener {
        googleLogin.login()
      }
    }

    companion object {
      const val TAG: String = "ANDROID_LARGE_THREE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, AndroidLargeThreeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
