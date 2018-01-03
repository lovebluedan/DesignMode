package com.danluo.titlebar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 林丹荣 on 2017/11/28.
 */

public class TheViewHolder extends RecyclerView.ViewHolder {

    TextView mTextView;

    public TheViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.list_item);
    }

}
