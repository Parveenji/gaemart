package com.parveensapplication.app.modules.framesixteen.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameSixteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFavorites: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
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
