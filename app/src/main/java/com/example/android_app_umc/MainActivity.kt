package com.example.android_app_umc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.android_app_umc.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.apply{
            adapter = PagerFragmentStateAdapter(context as FragmentActivity)
        }

        //tablayout에 들어갈 BreadCateogry 삽입
        TabLayoutMediator(binding.tabs,binding.viewpager){tab, position ->
            tab.setText(BreadCateogry.values()[position].categoryNameId)
        }.attach()

    }

}