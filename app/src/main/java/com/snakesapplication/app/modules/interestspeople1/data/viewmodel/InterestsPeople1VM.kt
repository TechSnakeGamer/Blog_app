package com.snakesapplication.app.modules.interestspeople1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.snakesapplication.app.modules.interestspeople1.`data`.model.InterestsPeople1Model
import org.koin.core.KoinComponent

class InterestsPeople1VM : ViewModel(), KoinComponent {
  val interestsPeople1Model: MutableLiveData<InterestsPeople1Model> =
      MutableLiveData(InterestsPeople1Model())

  var navArguments: Bundle? = null
}
