package com.snakesapplication.app.modules.privacypolicy.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PrivacyPolicyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEffectiveSept: String? =
      MyApp.getInstance().resources.getString(R.string.msg_effective_september)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanseeour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_see_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor5)

)
