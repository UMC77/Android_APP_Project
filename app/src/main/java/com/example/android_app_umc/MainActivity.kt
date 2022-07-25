package com.example.android_app_umc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.android_app_umc.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val strings = listOf("모든 빵","비건","샌드위치","크루아상","베이글", "파이", "와플", "케이크", "마카롱", "호밀빵")

        val fragmentList = listOf(FragmentA(), FragmentB(), FragmentC(), FragmentD(), FragmentE(),
            FragmentF(), FragmentG(), FragmentH(), FragmentI(), FragmentJ())
        val adapter = FragmentAdapter(this)
        adapter.fragmentList = fragmentList
        binding.viewpager.adapter = adapter

        val tabTitles = listOf<String>("모든 빵", "비건", "샌드위치", "크루아상", "베이글", "파이", "와플", "케이크", "마카롱", "호밀빵")
        TabLayoutMediator(binding.tabs, binding.viewpager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()

        val Storelist = ArrayList<StoreData>()

        for(index in 0..50)(
                Storelist.add(StoreData(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground)!!, "용커피", "서울시 강북구 오패산로"))
        )

        val adapter1 = RecycleAdapter(Storelist)
        //adapter1.Storelist = Storelist
        binding.lststore.adapter = adapter1

    }

}