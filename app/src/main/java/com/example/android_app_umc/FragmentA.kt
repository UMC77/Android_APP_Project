package com.example.android_app_umc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_app_umc.databinding.FragmentABinding
import com.example.android_app_umc.repository.MenuLists
import com.example.tablayout.base.BaseFragment

class FragmentA : BaseFragment<FragmentABinding>(FragmentABinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val choice =arguments?.getInt(MENUCATEGORY_ITEM)
        val viewpager = binding.lststore

        viewpager.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)


        choice?.let {
            when(choice){
                0 -> viewpager.adapter = FragmentAdapter(MenuLists.mainBread)
                1 -> viewpager.adapter = FragmentAdapter(MenuLists.subBread)
                2 -> viewpager.adapter = FragmentAdapter(MenuLists.mainBread)
                3 -> viewpager.adapter = FragmentAdapter(MenuLists.subBread)
                4 -> viewpager.adapter = FragmentAdapter(MenuLists.mainBread)
                5 -> viewpager.adapter = FragmentAdapter(MenuLists.subBread)
                6 -> viewpager.adapter = FragmentAdapter(MenuLists.mainBread)
                7 -> viewpager.adapter = FragmentAdapter(MenuLists.subBread)
                8 -> viewpager.adapter = FragmentAdapter(MenuLists.mainBread)
                9 -> viewpager.adapter = FragmentAdapter(MenuLists.subBread)
                10 -> viewpager.adapter = FragmentAdapter(MenuLists.mainBread)
                11 -> viewpager.adapter = FragmentAdapter(MenuLists.subBread)
                12 -> viewpager.adapter = FragmentAdapter(MenuLists.mainBread)
                13 -> viewpager.adapter = FragmentAdapter(MenuLists.subBread)
                else -> viewpager.adapter = FragmentAdapter(MenuLists.mainBread)
            }
        }

    }


    companion object {
        val MENUCATEGORY_ITEM = "menucateogry_item"
        @JvmStatic
        fun newInstance(position : Int) =
            FragmentA().apply {
                arguments = Bundle().apply {
                    putInt(MENUCATEGORY_ITEM, position)
                }
            }
    }
}