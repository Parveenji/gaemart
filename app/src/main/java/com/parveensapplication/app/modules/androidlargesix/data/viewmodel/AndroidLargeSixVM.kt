package com.parveensapplication.app.modules.androidlargesix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.parveensapplication.app.modules.androidlargesix.`data`.model.AndroidLargeSixModel
import org.koin.core.KoinComponent

class AndroidLargeSixVM : ViewModel(), KoinComponent {
  val androidLargeSixModel: MutableLiveData<AndroidLargeSixModel> =
      MutableLiveData(AndroidLargeSixModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
