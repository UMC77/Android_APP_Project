package com.example.android_app_umc

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    var fragmentList = listOf<Fragment>()

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

    /*override fun getPageTitle(position: Int) : CharSequence? {
        return when (position){
            0 -> "A"
            1 -> "B"
            2 -> "C"
            3 -> "D"
            else -> "E"
        }
    }*/
}