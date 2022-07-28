package com.example.android_app_umc

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_app_umc.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    private var bakeryDatas = ArrayList<Bakery>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): ScrollView {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.tvAddress.setOnClickListener {
            val intent = Intent(getActivity(),AddressActivity::class.java)
            startActivity(intent)
        } //내 위치 창으로 넘기는 거

        binding.ivAlarm.setOnClickListener {
            val intent = Intent(getActivity(),AlarmActivity::class.java)
            startActivity(intent)
        }

        binding.ivCart.setOnClickListener {
            val intent = Intent(getActivity(),CartActivity::class.java)
            startActivity(intent)
        }

        binding.ivCart.setOnClickListener {
            val intent = Intent(getActivity(),CartActivity::class.java)
            startActivity(intent)
        }

        bakeryDatas.apply{
            add(Bakery("A 빵집","4.9(00)",R.drawable.ex_bakery))
            add(Bakery("B 빵집","4.9(00)",R.drawable.ex_bakery))
            add(Bakery("C 빵집","4.9(00)",R.drawable.ex_bakery))
            add(Bakery("D 빵집","4.9(00)",R.drawable.ex_bakery))
            add(Bakery("E 빵집","4.9(00)",R.drawable.ex_bakery))
            add(Bakery("F 빵집","4.9(00)",R.drawable.ex_bakery))
        }

        val bakeryRVAdapter = BakeryRVAdapter(bakeryDatas)
        binding.homeAroundMeBakery.adapter = bakeryRVAdapter
        binding.homeAroundMeBakery.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.newAddBakery.adapter = bakeryRVAdapter
        binding.newAddBakery.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        return binding.root
    }

}