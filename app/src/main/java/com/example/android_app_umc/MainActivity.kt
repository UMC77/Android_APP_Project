package com.example.android_app_umc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_app_umc.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_my.*


class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    /*private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>? = null*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //프래그먼트
        val strings = listOf("모든 빵","비건","샌드위치","크루아상","베이글", "파이", "와플", "케이크", "마카롱", "호밀빵")

        val fragmentList = listOf(FragmentA(), FragmentB(), FragmentC(), FragmentD(), FragmentE(),
            FragmentF(), FragmentG(), FragmentH(), FragmentI(), FragmentJ())

        var adapter1 = FragmentAdapter(this)

        adapter1.fragmentList = fragmentList
        binding.viewpager.adapter = adapter1

        val tabTitles = listOf<String>("모든 빵", "비건", "샌드위치", "크루아상", "베이글", "파이", "와플", "케이크", "마카롱", "호밀빵")
        TabLayoutMediator(binding.tabs, binding.viewpager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()

        // 리싸이클뷰
        /*layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter*/

        val Storelist = ArrayList<StoreData>()

        for(index in 0..50)(
                Storelist.add(StoreData(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground)!!, "용커피","4.5", "서울시 강북구 오패산로"))
        )

        val adapter = RecyclerAdapter()
        adapter.storeData = Storelist
        binding.lststore.adapter = adapter

    }


}