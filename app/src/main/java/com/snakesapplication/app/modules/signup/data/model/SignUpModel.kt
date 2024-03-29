package com.snakesapplication.app.modules.signup.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? = MyApp.getInstance().resources.getString(R.string.lbl_register_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_google)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_facebook)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGoTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_twitter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGoThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_apple)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_you)

)
