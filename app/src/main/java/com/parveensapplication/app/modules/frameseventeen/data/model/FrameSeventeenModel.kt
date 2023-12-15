package com.parveensapplication.app.modules.frameseventeen.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameSeventeenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChat: String? = MyApp.getInstance().resources.getString(R.string.lbl_chat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameofseller: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_name_of_seller)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSafetyTips: String? = MyApp.getInstance().resources.getString(R.string.lbl_safety_tips)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDONTtakerisk: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_take_risk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_don_t_disclose)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_change_perso)
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
