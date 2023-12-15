package com.parveensapplication.app.modules.framefour.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderdetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlert: String? = MyApp.getInstance().resources.getString(R.string.lbl_alert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLevel: String? = MyApp.getInstance().resources.getString(R.string.lbl_level)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_85)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_24555)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_4000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWaitingforsel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_waiting_for_sel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisprocessca: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_process_ca2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixty: String? = MyApp.getInstance().resources.getString(R.string.msg_connect_with_cu)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftyNineValue: String? = null
)
