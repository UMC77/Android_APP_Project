package com.example.android_app_umc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.android_app_umc.model.BreadStore
import kotlinx.android.synthetic.main.detail_store_info.*

class StoreDetailInfoActivity : AppCompatActivity() {

    //프래그먼트에서 액티비티로 전환(클릭 이벤트)
    //lateinit var data : BreadStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_store_info)

        /*data = intent.getSerializableExtra("data") as BreadStore

        Glide.with(this).load(data.img).into(iv_Dstore)
        txtDStore_name.text = data.StoreName*/
    }
}