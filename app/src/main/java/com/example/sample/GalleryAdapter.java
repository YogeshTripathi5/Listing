package com.example.sample;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


import com.squareup.picasso.Picasso;


public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {
Context context;
    private int lastPosition = -1;


    public GalleryAdapter(MainActivity activity) {
        context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.gallery, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Picasso.get().load("https://api.healthie.in/media/wysiwyg/pass/690_900LunchMixNon-Veg(compressed).jpg").fit().into(viewHolder.imageView);
        setAnimation(viewHolder.cardView, i);


    }

    private void setAnimation(CardView cardView, int i) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (i > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            cardView.startAnimation(animation);
            lastPosition = i;
        }


    }



    @Override
    public int getItemCount() {
        return 30;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
     ImageView imageView;
     CardView cardView;
        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
            cardView = view.findViewById(R.id.cardView);
          }
    }
}
