package com.parveensapplication.app.modules.androidlargetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
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
import com.parveensapplication.app.databinding.ActivityAndroidLargeTwoBinding
import com.parveensapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.parveensapplication.app.modules.androidlargetwo.`data`.viewmodel.AndroidLargeTwoVM
import com.parveensapplication.app.modules.iphone13minione.ui.Iphone13MiniOneActivity
import com.parveensapplication.app.modules.iphone13minitwo.ui.Iphone13MiniTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidLargeTwoActivity :
    BaseActivity<ActivityAndroidLargeTwoBinding>(R.layout.activity_android_large_two) {
  private val viewModel: AndroidLargeTwoVM by viewModels<AndroidLargeTwoVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()


  private val facebookLogin: FacebookHelper = FacebookHelper()


  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ): Unit {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeTwoVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
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
        binding.btnBack.setOnClickListener {
          val destIntent = AndroidLargeOneActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.frameAndroidLarge.setOnClickListener {
          val destIntent = Iphone13MiniTwoActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }

      companion object {
        const val TAG: String = "ANDROID_LARGE_TWO_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, AndroidLargeTwoActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
