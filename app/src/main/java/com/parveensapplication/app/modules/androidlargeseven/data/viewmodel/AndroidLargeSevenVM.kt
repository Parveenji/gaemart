package com.parveensapplication.app.modules.androidlargeseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.parveensapplication.app.modules.androidlargeseven.`data`.model.AndroidLargeSevenModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class AndroidLargeSevenVM : ViewModel(), KoinComponent {
  val androidLargeSevenModel: MutableLiveData<AndroidLargeSevenModel> =
      MutableLiveData(AndroidLargeSevenModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
