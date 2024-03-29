package com.snakesapplication.app.modules.explore.ui

import android.view.View
import androidx.activity.viewModels
import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.base.BaseActivity
import com.snakesapplication.app.databinding.ActivityExploreBinding
import com.snakesapplication.app.modules.explore.`data`.model.ExploreRowModel
import com.snakesapplication.app.modules.explore.`data`.viewmodel.ExploreVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExploreActivity : BaseActivity<ActivityExploreBinding>(R.layout.activity_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val exploreAdapter = ExploreAdapter(viewModel.exploreList.value?:mutableListOf())
    binding.recyclerExplore.adapter = exploreAdapter
    exploreAdapter.setOnItemClickListener(
    object : ExploreAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ExploreRowModel) {
        onClickRecyclerExplore(view, position, item)
      }
    }
    )
    viewModel.exploreList.observe(this) {
      exploreAdapter.updateData(it)
    }
    binding.exploreVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerExplore(
    view: View,
    position: Int,
    item: ExploreRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EXPLORE_ACTIVITY"

  }
}
