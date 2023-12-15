package com.parveensapplication.app.modules.androidlargeten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.parveensapplication.app.modules.androidlargeten.`data`.model.AndroidLargeTenModel
import org.koin.core.KoinComponent

class AndroidLargeTenVM : ViewModel(), KoinComponent {
  val androidLargeTenModel: MutableLiveData<AndroidLargeTenModel> =
      MutableLiveData(AndroidLargeTenModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
