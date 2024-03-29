package com.snakesapplication.app.modules.notifications.ui

import androidx.activity.viewModels
import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.base.BaseActivity
import com.snakesapplication.app.databinding.ActivityNotificationsBinding
import com.snakesapplication.app.modules.notifications.`data`.viewmodel.NotificationsVM
import kotlin.String
import kotlin.Unit

class NotificationsActivity :
    BaseActivity<ActivityNotificationsBinding>(R.layout.activity_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ACTIVITY"

  }
}
