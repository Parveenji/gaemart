package com.parveensapplication.app.modules.framethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.framethree.`data`.model.FrameThreeModel
import org.koin.core.KoinComponent

class FrameThreeVM : ViewModel(), KoinComponent {
  val frameThreeModel: MutableLiveData<FrameThreeModel> = MutableLiveData(FrameThreeModel())

  var navArguments: Bundle? = null
}
