package com.snakesapplication.app.modules.explore.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopStories: String? = MyApp.getInstance().resources.getString(R.string.msg_recommended_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchBarValue: String? = null
)
