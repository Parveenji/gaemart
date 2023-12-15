package com.parveensapplication.app.modules.androidlargetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.parveensapplication.app.modules.androidlargetwo.`data`.model.AndroidLargeTwoModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class AndroidLargeTwoVM : ViewModel(), KoinComponent {
  val androidLargeTwoModel: MutableLiveData<AndroidLargeTwoModel> =
      MutableLiveData(AndroidLargeTwoModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
