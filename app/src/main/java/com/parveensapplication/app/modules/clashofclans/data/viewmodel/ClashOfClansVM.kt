package com.parveensapplication.app.modules.clashofclans.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.clashofclans.`data`.model.ClashOfClansModel
import org.koin.core.KoinComponent

class ClashOfClansVM : ViewModel(), KoinComponent {
  val clashOfClansModel: MutableLiveData<ClashOfClansModel> = MutableLiveData(ClashOfClansModel())

  var navArguments: Bundle? = null
}
