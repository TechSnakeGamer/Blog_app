package com.snakesapplication.app.modules.home.ui

import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.viewModels
import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.base.BaseActivity
import com.snakesapplication.app.databinding.ActivityHomeBinding
import com.snakesapplication.app.modules.home.`data`.model.HomeRowModel
import com.snakesapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.snakesapplication.app.modules.signin.ui.SignInActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(this) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    fun onClickRecyclerHome(
      view: View,
      position: Int,
      item: HomeRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "HOME_ACTIVITY"

    }
  }
