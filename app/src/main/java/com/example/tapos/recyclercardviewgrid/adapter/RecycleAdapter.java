package com.example.tapos.recyclercardviewgrid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tapos.recyclercardviewgrid.R;
import com.example.tapos.recyclercardviewgrid.model.Animal;

import java.util.List;

import static android.content.ContentValues.TAG;



public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {

    private List<Animal> mData;
    private LayoutInflater mInflater;

    public RecycleAdapter(Context context, List<Animal> data) {
        this.mData = data;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View itemView = mInflater.inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder" + position);
        Animal currentObj = mData.get(position);
        holder.setData(currentObj, position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView thumbnail;
        public int position;
        Animal current;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            thumbnail = (ImageView) view.findViewById(R.id.image_id);
        }

        public void setData(Animal currentObj, int position) {
            this.title.setText(currentObj.getTitle());
            this.thumbnail.setImageResource(currentObj.getImageId());
            this.position = position;
            this.current = currentObj;
        }
    }
}
