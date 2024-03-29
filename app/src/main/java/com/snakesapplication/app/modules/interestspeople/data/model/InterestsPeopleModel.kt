package com.snakesapplication.app.modules.interestspeople.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsPeopleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_see_all_people_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwentySeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_people_to_follow)

)
