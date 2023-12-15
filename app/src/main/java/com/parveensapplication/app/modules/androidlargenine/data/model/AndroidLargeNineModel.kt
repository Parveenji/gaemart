package com.parveensapplication.app.modules.androidlargenine.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeNineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacypolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gamemart_privac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFav: String? = MyApp.getInstance().resources.getString(R.string.lbl_fav)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInbox: String? = MyApp.getInstance().resources.getString(R.string.lbl_inbox)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)

)
