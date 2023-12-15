package com.parveensapplication.app.modules.framefourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.framefourteen.`data`.model.FrameFourteenModel
import org.koin.core.KoinComponent

class FrameFourteenVM : ViewModel(), KoinComponent {
  val frameFourteenModel: MutableLiveData<FrameFourteenModel> =
      MutableLiveData(FrameFourteenModel())

  var navArguments: Bundle? = null
}
