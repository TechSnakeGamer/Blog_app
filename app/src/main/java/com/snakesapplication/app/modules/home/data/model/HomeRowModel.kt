package com.snakesapplication.app.modules.home.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_logo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEasytoUse: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_days_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_min_read)

)
