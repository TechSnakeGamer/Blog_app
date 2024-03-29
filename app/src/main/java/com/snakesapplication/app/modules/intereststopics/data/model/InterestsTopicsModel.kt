package com.snakesapplication.app.modules.intereststopics.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsTopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtEntertain: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arts_entertainment)

)
