package com.snakesapplication.app.modules.interests.ui

import android.view.View
import androidx.activity.viewModels
import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.base.BaseActivity
import com.snakesapplication.app.databinding.ActivityInterestsBinding
import com.snakesapplication.app.modules.interests.`data`.model.InterestsRowModel
import com.snakesapplication.app.modules.interests.`data`.viewmodel.InterestsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InterestsActivity : BaseActivity<ActivityInterestsBinding>(R.layout.activity_interests) {
  private val viewModel: InterestsVM by viewModels<InterestsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val interestsAdapter = InterestsAdapter(viewModel.interestsList.value?:mutableListOf())
    binding.recyclerInterests.adapter = interestsAdapter
    interestsAdapter.setOnItemClickListener(
    object : InterestsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InterestsRowModel) {
        onClickRecyclerInterests(view, position, item)
      }
    }
    )
    viewModel.interestsList.observe(this) {
      interestsAdapter.updateData(it)
    }
    binding.interestsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerInterests(
    view: View,
    position: Int,
    item: InterestsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INTERESTS_ACTIVITY"

  }
}
