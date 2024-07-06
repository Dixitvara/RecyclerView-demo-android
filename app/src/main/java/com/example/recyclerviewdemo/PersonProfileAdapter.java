package com.example.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonProfileAdapter extends RecyclerView.Adapter<PersonProfileAdapter.ViewHolder> {
    public final ArrayList<PersonProfileModel> personData;

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView image;
        private final TextView name, mobile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.profile_image);
            name = itemView.findViewById(R.id.name);
            mobile = itemView.findViewById(R.id.mobile);
        }
    }

    public PersonProfileAdapter(ArrayList<PersonProfileModel> personData) {
        this.personData = personData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_profile_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(personData.get(position).image);
        holder.name.setText(personData.get(position).name);
        holder.mobile.setText(personData.get(position).mobile);
    }

    @Override
    public int getItemCount() {
        return personData.size();
    }
}