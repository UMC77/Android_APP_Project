package com.example.android_app_umc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_app_umc.databinding.StoreListBinding
import com.example.android_app_umc.model.BreadStore

class StoreFragmentAdapter(private val breadStoreList : List<BreadStore>) : RecyclerView.Adapter<StoreFragmentAdapter.MenuViewHolder>(){

    inner class MenuViewHolder(private val binding: StoreListBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(breadStore : BreadStore){
            binding.ivStore.setImageResource(breadStore.img)
            binding.txtStoreName.text = breadStore.StoreName
            binding.txtStoreStar.text = breadStore.StoreStar
            binding.txtStoreLocate.text = breadStore.StoreLocate
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return  MenuViewHolder(
            StoreListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(breadStoreList[position])
    }

    override fun getItemCount(): Int  = breadStoreList.size

}