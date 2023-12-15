package com.parveensapplication.app.modules.androidlargeeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.androidlargeeight.`data`.model.AndroidLargeEightModel
import org.koin.core.KoinComponent

class AndroidLargeEightVM : ViewModel(), KoinComponent {
  val androidLargeEightModel: MutableLiveData<AndroidLargeEightModel> =
      MutableLiveData(AndroidLargeEightModel())

  var navArguments: Bundle? = null
}
