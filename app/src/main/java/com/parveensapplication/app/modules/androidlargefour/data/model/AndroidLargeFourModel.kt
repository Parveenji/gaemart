package com.parveensapplication.app.modules.androidlargefour.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLeadingMarketp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_leading_marketp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_trade_securly_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_buy_gaming_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gamemart_is_a_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHOWITWORKS: String? = MyApp.getInstance().resources.getString(R.string.lbl_how_it_works)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_trading_gaming)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_provide_a_sa)

)
