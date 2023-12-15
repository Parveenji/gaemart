package com.parveensapplication.app.modules.gamemart.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GamemartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_gamemart_buy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlert: String? = MyApp.getInstance().resources.getString(R.string.lbl_alert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_are_you_lo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreefire: String? = MyApp.getInstance().resources.getString(R.string.lbl_freefire)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBgmi: String? = MyApp.getInstance().resources.getString(R.string.lbl_bgmi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCod: String? = MyApp.getInstance().resources.getString(R.string.lbl_cod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_coc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountsforyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_accounts_for_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLevelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_level)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyFiveOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_85)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundredTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_24555)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_4000)
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
