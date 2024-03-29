package com.snakesapplication.app.modules.searchtopics.ui

import androidx.activity.viewModels
import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.base.BaseActivity
import com.snakesapplication.app.databinding.ActivitySearchTopicsBinding
import com.snakesapplication.app.modules.searchtopics.`data`.viewmodel.SearchTopicsVM
import kotlin.String
import kotlin.Unit

class SearchTopicsActivity :
    BaseActivity<ActivitySearchTopicsBinding>(R.layout.activity_search_topics) {
  private val viewModel: SearchTopicsVM by viewModels<SearchTopicsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchTopicsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SEARCH_TOPICS_ACTIVITY"

  }
}
