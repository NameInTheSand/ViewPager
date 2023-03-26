package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerTestAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    private val fragments = listOf(FragmentOne(), FragmentTwo(), FragmentThree())

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}