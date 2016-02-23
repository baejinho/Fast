package com.apphunger.baejinho.fast.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apphunger.baejinho.fast.R;
import com.apphunger.baejinho.fast.TasteVO;
import com.apphunger.baejinho.fast.adapter.holder.TasteHolder;

import java.util.List;

//import com.memo.studygroup.newmemoapp.intent.IntentHandler;

public class TasteListAdapter extends RecyclerView.Adapter<TasteHolder> {

	private Context context;
	private List<TasteVO> itemList;

	public TasteListAdapter(Context context, List<TasteVO> itemList) {
		this.context = context;
		this.itemList = itemList;
	}

	@Override
	public TasteHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
		View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_taste, viewGroup, false);
		return new TasteHolder(view);
	}

	@Override
	public void onBindViewHolder(TasteHolder holder, final int position) {
		//holder.idTextView.setText(String.valueOf(itemList.get(position).getId()));

		//holder.imageView.set
		holder.name_textView.setText("["+itemList.get(position).getCategory()+"] "+itemList.get(position).getName());
		holder.price_textView.setText("대표가격 : "+itemList.get(position).getPublicprice());
		holder.like_textView.setText(""+itemList.get(position).getLike());

		/*
		holder.idTextView.setText(""+itemList.get(position).getOrder());

		holder.memoTextView.setText(itemList.get(position).getMemo());
		holder.regDateTextView.setText(itemList.get(position).getRegdate());
		holder.itemLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//IntentHandler.moveToMemoActivity(context, itemList.get(position));

			}
		});
		*/

	}

	@Override
	public int getItemCount() {
		return (itemList.size() > 0) ? itemList.size() : 0;
	}

}
