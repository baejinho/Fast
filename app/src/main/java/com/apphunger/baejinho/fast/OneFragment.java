package com.apphunger.baejinho.fast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apphunger.baejinho.fast.adapter.TasteListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class OneFragment extends Fragment {

    @InjectView(R.id.recycler_list_view)
    protected RecyclerView tasteListView;

    private RecyclerView.LayoutManager tasteListLayoutManager;
    private TasteListAdapter tasteListAdapter;

    private List<TasteVO> tasteVOList;

    public OneFragment() {
        // Required empty public constructor

        tasteVOList = new ArrayList<TasteVO>();
        tasteVOList.clear();

        TasteVO tmp = new TasteVO();
        tmp.setCategory("노원");
        tmp.setName("털보네");
        tmp.setPublicprice(14000);
        tmp.setLike(5);

        tasteVOList.add(tmp);

        tmp = new TasteVO();
        tmp.setCategory("노원");
        tmp.setName("용만이 돈까스");
        tmp.setPublicprice(10000);
        tmp.setLike(10);

        tasteVOList.add(tmp);
        tmp = new TasteVO();
        tmp.setCategory("노원");
        tmp.setName("노랑통닭");
        tmp.setPublicprice(16000);
        tmp.setLike(5);

        tasteVOList.add(tmp);
        tmp = new TasteVO();
        tmp.setCategory("노원");
        tmp.setName("문어치킨");
        tmp.setPublicprice(17000);
        tmp.setLike(15);

        tasteVOList.add(tmp);






    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = (View)inflater.inflate(R.layout.fragment_one, container, false);

        ButterKnife.inject(this, view);

        initializationRecyclerView(view);

        return view;
    }

    private void initializationRecyclerView(View view) {
        tasteListLayoutManager = new LinearLayoutManager(view.getContext());
        tasteListView.setLayoutManager(tasteListLayoutManager);
        if(tasteVOList.size() != 0) {
            tasteListAdapter = new TasteListAdapter(view.getContext(), tasteVOList);
            tasteListView.setAdapter(tasteListAdapter);
        }

    }
}
