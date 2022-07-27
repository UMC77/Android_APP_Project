package com.example.android_app_umc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {

    ArrayList<StoreData> storeData = new ArrayList<>();

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // LayoutInflater를 이용하여 전 단계에서 만들었던 item.xml을 inflate 시킵니다.
        // return 인자는 ViewHolder 입니다.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_a, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        // Item을 하나, 하나 보여주는(bind 되는) 함수입니다.
        holder.onBind(storeData.get(position));
    }

    @Override
    public int getItemCount() {
        // RecyclerView의 총 개수 입니다.
        return storeData.size();
    }

    public void addItem(StoreData data) {
        // 외부에서 item을 추가시킬 함수입니다.
        storeData.add(data);
    }

    // RecyclerView의 핵심인 ViewHolder 입니다.
    // 여기서 subView를 setting 해줍니다.
    class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView StoreName;
        private TextView StoreStar;
        private TextView StoreLocate;

        ItemViewHolder(View itemView) {
            super(itemView);

            StoreName = itemView.findViewById(R.id.txtStore_name);
            StoreStar = itemView.findViewById(R.id.txtStore_Star);
            StoreLocate = itemView.findViewById(R.id.txtStore_locate);
        }

        void onBind(StoreData data) {
            StoreName.setText(data.getStoreName());
            StoreStar.setText(data.getStoreStar());
            StoreLocate.setText(data.getStoreLocate());
        }
    }
}
