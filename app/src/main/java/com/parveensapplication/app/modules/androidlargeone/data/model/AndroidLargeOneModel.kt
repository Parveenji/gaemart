package com.parveensapplication.app.modules.androidlargeone.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFiftySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_2_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddScreenshort: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_screenshort)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_a_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_your_all_co)

)
