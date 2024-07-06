package com.example.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// adapter class
class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {
    private final ArrayList<FlowerModel> flowers;

    // view holder class
    static class FlowerViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public FlowerViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.flower_text);
        }
    }

    public FlowerAdapter(ArrayList<FlowerModel> flowers) {
        this.flowers = flowers;
    }

    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_item, parent, false);
        return new FlowerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder holder, int position) {
        holder.textView.setText(flowers.get(position).name);
    }

    @Override
    public int getItemCount() {
        return flowers.size();
    }
}