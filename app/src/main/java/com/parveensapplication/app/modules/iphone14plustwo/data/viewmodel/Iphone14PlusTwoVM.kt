package com.parveensapplication.app.modules.iphone14plustwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.iphone14plustwo.`data`.model.Iphone14PlusTwoModel
import org.koin.core.KoinComponent

class Iphone14PlusTwoVM : ViewModel(), KoinComponent {
  val iphone14PlusTwoModel: MutableLiveData<Iphone14PlusTwoModel> =
      MutableLiveData(Iphone14PlusTwoModel())

  var navArguments: Bundle? = null
}
