package com.example.mybook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mybook.databinding.RecyclerowBinding;

import java.util.ArrayList;

public class recycleadapter extends RecyclerView.Adapter<recycleadapter.recycleholder> {

    public recycleadapter(ArrayList<bookproperty> bookpropertyArrayList) {
        this.bookpropertyArrayList = bookpropertyArrayList;
    }

    ArrayList<bookproperty> bookpropertyArrayList;
    @NonNull
    @Override
    public recycleholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerowBinding recyclerowBinding = RecyclerowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new recycleholder(recyclerowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull recycleholder holder, @SuppressLint("RecyclerView") int position) {
    holder.binding.yazdR.setText(bookpropertyArrayList.get(position).ad);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(holder.itemView.getContext(), detaylar.class);
            intent.putExtra("ad",bookpropertyArrayList.get(position).ad);
            intent.putExtra("yazar",bookpropertyArrayList.get(position).yazar);
            holder.itemView.getContext().startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return bookpropertyArrayList.size();
    }

    public class recycleholder extends RecyclerView.ViewHolder {
        private RecyclerowBinding binding;
        public recycleholder(RecyclerowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
