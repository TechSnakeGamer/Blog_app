package com.snakesapplication.app.modules.interests.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_are_you_interested)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptiontes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_or_edit_topics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChips: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChipsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_cryptocurrency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChipsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)

)
