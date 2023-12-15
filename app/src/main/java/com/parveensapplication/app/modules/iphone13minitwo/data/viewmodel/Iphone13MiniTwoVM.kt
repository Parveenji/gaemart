package com.parveensapplication.app.modules.iphone13minitwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.iphone13minitwo.`data`.model.Iphone13MiniTwoModel
import org.koin.core.KoinComponent

class Iphone13MiniTwoVM : ViewModel(), KoinComponent {
  val iphone13MiniTwoModel: MutableLiveData<Iphone13MiniTwoModel> =
      MutableLiveData(Iphone13MiniTwoModel())

  var navArguments: Bundle? = null
}
