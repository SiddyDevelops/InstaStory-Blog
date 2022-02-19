package com.siddydevelops.instastory.RVAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.siddydevelops.instastory.R;
import com.siddydevelops.instastory.StoryPlayerActivity;

public class StoryViewAdapter extends RecyclerView.Adapter<StoryViewAdapter.StoryViewHolder> {

    String[] usernameList;
    public StoryViewAdapter(String[] usernameList) {
        this.usernameList = usernameList;
    }

//    private final String[] ImageURls = {"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/11.png",
////            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/41.png",
////            "https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg"};
////
////    private final String[] usernames = {"Siddharth Singh", "Mika Rami", "Sokata Ryuk"};
////    private final String[] storyTimes = {"15hr Ago", "8hr Ago", "9hr Ago"};
////    private final String[] likeCounts = {"22K", "257", "6.8K"};
////    private final String[] storyText = {"New Pokemon now live!", "Gather tonight for the latest event by AC/DC", "People around the world are crazy!"};


    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.story_item_layout,parent,false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        holder.username.setText(usernameList[position]);
        holder.frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), StoryPlayerActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return usernameList.length;
    }

    public static class StoryViewHolder extends RecyclerView.ViewHolder
    {
        TextView username;
        FrameLayout frameLayout;
        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.username);
            frameLayout = itemView.findViewById(R.id.frameLayout);
        }
    }

}
