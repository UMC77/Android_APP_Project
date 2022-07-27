package com.example.android_app_umc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_app_umc.databinding.StoreListBinding
import com.example.android_app_umc.model.Menu

class FragmentAdapter(private val menuList : List<Menu>) : RecyclerView.Adapter<FragmentAdapter.MenuViewHolder>(){

    inner class MenuViewHolder(private val binding: StoreListBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(menu : Menu){
            binding.ivStore.setImageResource(menu.img)
            binding.txtStoreName.text = menu.StoreName
            binding.txtStoreStar.text = menu.StoreStar
            binding.txtStoreLocate.text = menu.StoreLocate
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return  MenuViewHolder(
            StoreListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(menuList[position])
    }

    override fun getItemCount(): Int  = menuList.size

}