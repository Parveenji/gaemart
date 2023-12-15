package com.parveensapplication.app.modules.frameten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.frameten.`data`.model.FrameTenModel
import org.koin.core.KoinComponent

class FrameTenVM : ViewModel(), KoinComponent {
  val frameTenModel: MutableLiveData<FrameTenModel> = MutableLiveData(FrameTenModel())

  var navArguments: Bundle? = null
}
