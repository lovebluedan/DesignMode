package com.danluo.titlebar;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by 林丹荣 on 2017/11/28.
 */

public class TextAdapter extends RecyclerView.Adapter<TheViewHolder> {
    private Context mContext;
    private ArrayList<String> mData;
   public TextAdapter(Context context, ArrayList<String> data){
       mContext =context;
       mData = data;
   }



    @Override
    public TheViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_bar,parent,false);
                TheViewHolder theViewHolder = new TheViewHolder(view);
                return theViewHolder;
    }

    @Override
    public void onBindViewHolder(TheViewHolder holder, int position) {
        holder.mTextView.setText(mData.get(position));
        holder.mTextView.setTextColor(Color.rgb(225,225,225));
    }




    @Override
    public int getItemCount() {
        return mData.size();
    }
}
