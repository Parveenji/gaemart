package com.parveensapplication.app.modules.androidlargeseven.ui

import android.content.Intent
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.appcomponents.facebookauth.FacebookHelper
import com.parveensapplication.app.appcomponents.googleauth.GoogleHelper
import com.parveensapplication.app.databinding.ActivityAndroidLargeSevenBinding
import com.parveensapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.parveensapplication.app.modules.androidlargeseven.`data`.viewmodel.AndroidLargeSevenVM
import com.parveensapplication.app.modules.iphone13minione.ui.Iphone13MiniOneActivity
import com.parveensapplication.app.modules.iphone13minitwo.ui.Iphone13MiniTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidLargeSevenActivity :
    BaseActivity<ActivityAndroidLargeSevenBinding>(R.layout.activity_android_large_seven) {
  private val viewModel: AndroidLargeSevenVM by viewModels<AndroidLargeSevenVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeSevenVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.btnBack.setOnClickListener {
        val destIntent = AndroidLargeOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnNext.setOnClickListener {
        val destIntent = Iphone13MiniOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnGoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.btnFacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.frameAndroidLarge.setOnClickListener {
          val destIntent = Iphone13MiniTwoActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }

      companion object {
        const val TAG: String = "ANDROID_LARGE_SEVEN_ACTIVITY"

      }
    }
