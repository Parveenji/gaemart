package com.parveensapplication.app.modules.iphone13minione.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.iphone13minione.`data`.model.Iphone13MiniOneModel
import org.koin.core.KoinComponent

class Iphone13MiniOneVM : ViewModel(), KoinComponent {
  val iphone13MiniOneModel: MutableLiveData<Iphone13MiniOneModel> =
      MutableLiveData(Iphone13MiniOneModel())

  var navArguments: Bundle? = null
}
