package com.snakesapplication.app.modules.interests.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChipsThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChipsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChipsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ipsum)

)
