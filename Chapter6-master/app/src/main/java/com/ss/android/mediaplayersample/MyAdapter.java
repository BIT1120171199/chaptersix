package com.ss.android.mediaplayersample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{


    ImageView imageView;
    public MyAdapter(ImageView imageView) {
       this.imageView=imageView;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, viewGroup,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.init();
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private StandardGSYVideoPlayer videoPlayer;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        videoPlayer=itemView.findViewById(R.id.detail_player);
        }
        private void init() {
            String source1 = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4";
            imageView.setImageResource(R.mipmap.xxx1);
            videoPlayer.setUp(source1, true, "Video");
            videoPlayer.setIsTouchWiget(true);
            videoPlayer.startPlayLogic();
        }


    }


}
