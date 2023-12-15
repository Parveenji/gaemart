package com.parveensapplication.app.modules.framenine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.framenine.`data`.model.FrameNineModel
import org.koin.core.KoinComponent

class FrameNineVM : ViewModel(), KoinComponent {
  val frameNineModel: MutableLiveData<FrameNineModel> = MutableLiveData(FrameNineModel())

  var navArguments: Bundle? = null
}
