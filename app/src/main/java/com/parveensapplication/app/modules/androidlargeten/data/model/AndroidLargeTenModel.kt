package com.parveensapplication.app.modules.androidlargeten.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeTenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuewithg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_with_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSinginAnonymo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sing_in_anonymo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtByclickingLog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_clicking_log)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup162Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup164Value: String? = null
)
