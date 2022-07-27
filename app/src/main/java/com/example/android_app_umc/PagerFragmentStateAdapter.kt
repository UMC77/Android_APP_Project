package com.example.android_app_umc

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android_app_umc.FragmentA

class PagerFragmentStateAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    private val NUM_PAGES = 15

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int) = FragmentA.newInstance(position)
}