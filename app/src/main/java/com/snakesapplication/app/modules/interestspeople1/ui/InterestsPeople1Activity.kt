package com.snakesapplication.app.modules.interestspeople1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.snakesapplication.app.R
import com.snakesapplication.app.appcomponents.base.BaseActivity
import com.snakesapplication.app.databinding.ActivityInterestsPeople1Binding
import com.snakesapplication.app.modules.interestspeople1.`data`.viewmodel.InterestsPeople1VM
import kotlin.String
import kotlin.Unit

class InterestsPeople1Activity :
    BaseActivity<ActivityInterestsPeople1Binding>(R.layout.activity_interests_people1) {
  private val viewModel: InterestsPeople1VM by viewModels<InterestsPeople1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.interestsPeople1VM = viewModel
    val adapter = InterestsPeople1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup2,binding.viewPagerViewpager) { tab, position ->
      tab.text = InterestsPeople1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "INTERESTS_PEOPLE1ACTIVITY"

    }
  }
