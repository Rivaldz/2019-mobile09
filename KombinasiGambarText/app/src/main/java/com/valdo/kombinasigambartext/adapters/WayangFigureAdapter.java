package com.valdo.kombinasigambartext.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.valdo.kombinasigambartext.Models.WayangFigure;
import com.valdo.kombinasigambartext.R;

import java.util.List;

public class WayangFigureAdapter extends
        RecyclerView.Adapter<WayangFigureAdapter.MyViewHolder> {

   List<WayangFigure> wayangList;

    public WayangFigureAdapter(List<WayangFigure> wayangList){
        this.wayangList = wayangList;
    }

    @NonNull
    @Override
    public WayangFigureAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View wayangFigureView = layoutInflater.inflate(R.layout.item_wayang,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(wayangFigureView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WayangFigureAdapter.MyViewHolder holder, int position) {
        WayangFigure wayang = wayangList.get(position);

        int resourceGambar = wayang.getWayangImage();
        String nama = wayang.getWayangName();

        holder.figureName.setText(wayang.getWayangName());
        holder.figureImage.setImageResource(wayang.getWayangImage());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView figureName;
        public ImageView figureImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            figureName = itemView.findViewById(R.id.tvNama);
            figureImage = itemView.findViewById(R.id.ivGambar);
        }

    }
}
