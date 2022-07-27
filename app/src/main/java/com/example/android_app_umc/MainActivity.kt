package com.example.android_app_umc

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        //tablayout에 들어갈 recipeGategory 삽입
        TabLayoutMediator(binding.tabs,binding.viewpager){tab, position ->
            tab.setText(RecipeCateogry.values()[position].categoryNameId)
        }.attach()

    }

}