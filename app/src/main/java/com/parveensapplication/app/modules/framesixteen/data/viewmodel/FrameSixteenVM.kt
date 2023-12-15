package com.parveensapplication.app.modules.framesixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.framesixteen.`data`.model.FrameSixteenModel
import org.koin.core.KoinComponent

class FrameSixteenVM : ViewModel(), KoinComponent {
  val frameSixteenModel: MutableLiveData<FrameSixteenModel> = MutableLiveData(FrameSixteenModel())

  var navArguments: Bundle? = null
}
