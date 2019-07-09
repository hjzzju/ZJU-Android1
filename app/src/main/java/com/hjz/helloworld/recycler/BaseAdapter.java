package com.hjz.helloworld.recycler;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseAdapter<T> extends RecyclerView.Adapter<BaseAdapter.BaseHolder> {
    @NonNull
    @Override
    public BaseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class BaseHolder extends RecyclerView.ViewHolder{

        public BaseHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
