package com.example.android_app_umc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.android_app_umc.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    //lateinit var sfadapter : StoreFragmentAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //initRecycler()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.apply{
            adapter = PagerFragmentStateAdapter(context as FragmentActivity)
        }

        //tablayout에 들어갈 BreadCateogry 삽입
        TabLayoutMediator(binding.tabs,binding.viewpager){tab, position ->
            tab.setText(BreadCateogry.values()[position].categoryNameId)
        }.attach()

        //프래그먼트에서 액티비티로 전환(클릭 이벤트)
        /*sfadapter.setOnItemClickListener(object : StoreFragmentAdapter.OnItemClickListener{
            override fun onItemClick(v: View, breadStore: BreadStore, pos : Int) {
                Intent(this@MainActivity, StoreDetailInfoActivity::class.java).apply {
                    putExtra("data", breadStore)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }.run { startActivity(this) }
            }

        })*/
    }

    //sfadapter 초기화하는 함수
    /*private fun initRecycler() {
        sfadapter = StoreFragmentAdapter(BreadLists.mainBread)
        //lststore.adapter = sfadapter
    }*/

}