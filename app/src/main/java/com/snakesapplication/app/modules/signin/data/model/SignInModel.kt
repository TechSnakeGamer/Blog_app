package com.snakesapplication.app.modules.signin.`data`.model

import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_google)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_facebook)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGoTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_twitter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGoThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_apple)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)

)
