package com.parveensapplication.app.modules.iphone13minitwo.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13MiniTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtENTERIDNUMBER: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_id_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtENTERIDLEVEL: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_id_level)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredTwentyThreeOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_gp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOTALCOINS: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_coins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredTwentyThreeTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKeyPlayers: String? = MyApp.getInstance().resources.getString(R.string.lbl_key_players)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredTwentyThreeThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrency: String? = MyApp.getInstance().resources.getString(R.string.lbl_currency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmount: String? = MyApp.getInstance().resources.getString(R.string.lbl_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup141Value: String? = null
)
