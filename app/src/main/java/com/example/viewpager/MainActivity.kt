package com.example.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private const val FRAGMENT_FIRST_POSITION = 0
private const val FRAGMENT_SECOND_POSITION = 1
private const val FRAGMENT_THIRD_POSITION = 2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pager = findViewById<ViewPager2>(R.id.pager)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        pager.adapter = ViewPagerTestAdapter(this)

        TabLayoutMediator(tabLayout, pager) { tab: TabLayout.Tab, position: Int ->
            tab.text = when (position) {
                FRAGMENT_FIRST_POSITION -> getString(R.string.lbl_fragment_one)
                FRAGMENT_SECOND_POSITION -> getString(R.string.lbl_fragment_two)
                FRAGMENT_THIRD_POSITION -> getString(R.string.lbl_fragment_three)
                else -> throw java.lang.IllegalStateException()
            }
        }.attach()

    }

}