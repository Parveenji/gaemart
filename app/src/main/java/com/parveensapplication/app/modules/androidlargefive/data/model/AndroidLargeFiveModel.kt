package com.parveensapplication.app.modules.androidlargefive.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTEPFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_5_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_20_of_selling)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSowerecommend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_so_we_recommend)

)
