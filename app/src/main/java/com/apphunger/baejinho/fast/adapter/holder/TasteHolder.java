package com.apphunger.baejinho.fast.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.apphunger.baejinho.fast.R;

public class TasteHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView name_textView;
    public TextView price_textView;

    public TextView like_textView;

    public LinearLayout itemLayout;

    public View.OnClickListener onClickListener;


    public TasteHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        name_textView = (TextView) itemView.findViewById(R.id.name_textView);
        price_textView = (TextView) itemView.findViewById(R.id.price_textView);
        like_textView = (TextView) itemView.findViewById(R.id.like_textView);
    }

}
