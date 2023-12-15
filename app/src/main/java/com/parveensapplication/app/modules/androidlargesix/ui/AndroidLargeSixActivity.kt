package com.parveensapplication.app.modules.androidlargesix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.appcomponents.googleauth.GoogleHelper
import com.parveensapplication.app.databinding.ActivityAndroidLargeSixBinding
import com.parveensapplication.app.modules.androidlargesix.`data`.viewmodel.AndroidLargeSixVM
import kotlin.String
import kotlin.Unit

class AndroidLargeSixActivity :
    BaseActivity<ActivityAndroidLargeSixBinding>(R.layout.activity_android_large_six) {
  private val viewModel: AndroidLargeSixVM by viewModels<AndroidLargeSixVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeSixVM = viewModel
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
      const val TAG: String = "ANDROID_LARGE_SIX_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, AndroidLargeSixActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
