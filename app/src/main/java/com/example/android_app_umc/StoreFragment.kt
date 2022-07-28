package com.example.android_app_umc

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_app_umc.base.BaseFragment
import com.example.android_app_umc.databinding.StoreListFragmentBinding
import com.example.android_app_umc.repository.BreadLists

class StoreFragment : BaseFragment<StoreListFragmentBinding>(StoreListFragmentBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val choice =arguments?.getInt(MENUCATEGORY_ITEM)
        val viewpager = binding.lststore

        viewpager.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)


        choice?.let {
            when(choice){
                0 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.mainBread)
                1 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.subBread)
                2 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.mainBread)
                3 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.subBread)
                4 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.mainBread)
                5 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.subBread)
                6 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.mainBread)
                7 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.subBread)
                8 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.mainBread)
                9 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.subBread)
                10 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.mainBread)
                11 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.subBread)
                12 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.mainBread)
                13 -> viewpager.adapter = StoreFragmentAdapter(BreadLists.subBread)
                else -> viewpager.adapter = StoreFragmentAdapter(BreadLists.mainBread)
            }
        }

    }


    companion object {
        val MENUCATEGORY_ITEM = "menucateogry_item"
        @JvmStatic
        fun newInstance(position : Int) =
            StoreFragment().apply {
                arguments = Bundle().apply {
                    putInt(MENUCATEGORY_ITEM, position)
                }
            }
    }
}