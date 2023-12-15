package com.parveensapplication.app.modules.frameeighteen.`data`.model

import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameEighteenModel(
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
  var txtWritesomething: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_something)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSend: String? = MyApp.getInstance().resources.getString(R.string.lbl_send)
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
