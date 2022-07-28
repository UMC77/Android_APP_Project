package com.example.android_app_umc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_app_umc.databinding.StoreListBinding
import com.example.android_app_umc.model.BreadStore

class StoreFragmentAdapter(private val breadStoreList : List<BreadStore>) : RecyclerView.Adapter<StoreFragmentAdapter.MenuViewHolder>(){

    //프래그먼트에서 액티비티로 전환(클릭 이벤트)
    interface OnItemClickListener{
        fun onItemClick(v: View, breadStore: BreadStore, pos : Int)
    }

    private var listener : OnItemClickListener? = null
    fun setOnItemClickListener(listener : OnItemClickListener) {
        this.listener = listener
    }

    inner class MenuViewHolder(private val binding: StoreListBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(breadStore : BreadStore){
            binding.ivStore.setImageResource(breadStore.img)
            binding.txtStoreName.text = breadStore.StoreName
            binding.txtStoreStar.text = breadStore.StoreStar
            binding.txtStoreLocate.text = breadStore.StoreLocate

            //프래그먼트에서 액티비티로 전환(클릭 이벤트)
            val pos = adapterPosition
            if(pos!= RecyclerView.NO_POSITION)
            {
                itemView.setOnClickListener {
                    listener?.onItemClick(itemView,breadStore,pos)
                }
            }
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