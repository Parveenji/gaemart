package com.parveensapplication.app.modules.androidlargeseven.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSTEPThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_3_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowyourskins: String? =
      MyApp.getInstance().resources.getString(R.string.msg_show_your_skins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOptional: String? = MyApp.getInstance().resources.getString(R.string.lbl_optional)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesize: String? = MyApp.getInstance().resources.getString(R.string.msg_video_shoud_not)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogins: String? = MyApp.getInstance().resources.getString(R.string.lbl_logins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBUILDERHall: String? = MyApp.getInstance().resources.getString(R.string.lbl_builder_hall)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOptionalOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_optional)

)
