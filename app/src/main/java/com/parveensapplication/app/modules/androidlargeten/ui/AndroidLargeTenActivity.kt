package com.parveensapplication.app.modules.androidlargeten.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.appcomponents.googleauth.GoogleHelper
import com.parveensapplication.app.databinding.ActivityAndroidLargeTenBinding
import com.parveensapplication.app.modules.androidlargeten.`data`.viewmodel.AndroidLargeTenVM
import com.parveensapplication.app.modules.gamemart.ui.GamemartActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeTenActivity :
    BaseActivity<ActivityAndroidLargeTenBinding>(R.layout.activity_android_large_ten) {
  private val viewModel: AndroidLargeTenVM by viewModels<AndroidLargeTenVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeTenVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowrectanglesixtythree.setOnClickListener {
        googleLogin.login()
      }
      binding.linearColumnlogin.setOnClickListener {
        val destIntent = GamemartActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "ANDROID_LARGE_TEN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, AndroidLargeTenActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
