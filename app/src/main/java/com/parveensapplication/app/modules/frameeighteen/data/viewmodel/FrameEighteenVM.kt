package com.parveensapplication.app.modules.frameeighteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.frameeighteen.`data`.model.FrameEighteenModel
import org.koin.core.KoinComponent

class FrameEighteenVM : ViewModel(), KoinComponent {
  val frameEighteenModel: MutableLiveData<FrameEighteenModel> =
      MutableLiveData(FrameEighteenModel())

  var navArguments: Bundle? = null
}
