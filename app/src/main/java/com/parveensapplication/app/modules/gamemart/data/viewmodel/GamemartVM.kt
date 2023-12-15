package com.parveensapplication.app.modules.gamemart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parveensapplication.app.modules.gamemart.`data`.model.GamemartModel
import com.parveensapplication.app.modules.gamemart.`data`.model.ListrectanglesixRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GamemartVM : ViewModel(), KoinComponent {
  val gamemartModel: MutableLiveData<GamemartModel> = MutableLiveData(GamemartModel())

  var navArguments: Bundle? = null

  val listrectanglesixList: MutableLiveData<MutableList<ListrectanglesixRowModel>> =
      MutableLiveData(mutableListOf())
}
