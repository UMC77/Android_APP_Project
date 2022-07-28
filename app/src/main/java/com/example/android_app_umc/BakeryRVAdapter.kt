package com.example.android_app_umc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_app_umc.databinding.ItemBakeryBinding
import java.util.*

class BakeryRVAdapter(private val bakeryList: ArrayList<Bakery>): RecyclerView.Adapter<BakeryRVAdapter.ViewHolder>() {

    interface MyItemClickListener{
        fun onItemClick(bakery: Bakery)
        fun onRemoveAlbum(position: Int)
    }

    private lateinit var mItemClickListener: MyItemClickListener
    fun setMyItemClickListener(itemClickListener: MyItemClickListener){
        mItemClickListener = itemClickListener
    }

    fun addItem(bakery: Bakery){
        bakeryList.add(bakery)
        notifyDataSetChanged()
    }

    fun removeItem(position: Int){
        bakeryList.removeAt(position)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BakeryRVAdapter.ViewHolder {
        val binding: ItemBakeryBinding = ItemBakeryBinding.inflate(LayoutInflater.from(viewGroup.context),viewGroup,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BakeryRVAdapter.ViewHolder, position: Int) {
        holder.bind(bakeryList[position])
        holder.itemView.setOnClickListener { mItemClickListener.onItemClick(bakeryList[position]) }
    }

    override fun getItemCount(): Int = bakeryList.size

    inner class ViewHolder(val binding: ItemBakeryBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(bakery: Bakery){
                binding.itemBakeryTitleTv.text = bakery.name
                binding.itemBakerySingerTv.text = bakery.star_rating
                binding.itemBakeryCoverImgIv.setImageResource(bakery.coverImg!!)
        }
    }
}



