package com.parveensapplication.app.modules.frameseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.frameseven.`data`.model.FrameSevenModel
import org.koin.core.KoinComponent

class FrameSevenVM : ViewModel(), KoinComponent {
  val frameSevenModel: MutableLiveData<FrameSevenModel> = MutableLiveData(FrameSevenModel())

  var navArguments: Bundle? = null
}
