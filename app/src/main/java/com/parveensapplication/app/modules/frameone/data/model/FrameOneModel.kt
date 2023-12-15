package com.parveensapplication.app.modules.frameone.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTEPFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_1_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectwhichga: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_which_ga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixteenValue: String? = null
)
