package com.parveensapplication.app.modules.frameseventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.frameseventeen.`data`.model.FrameSeventeenModel
import org.koin.core.KoinComponent

class FrameSeventeenVM : ViewModel(), KoinComponent {
  val frameSeventeenModel: MutableLiveData<FrameSeventeenModel> =
      MutableLiveData(FrameSeventeenModel())

  var navArguments: Bundle? = null
}
