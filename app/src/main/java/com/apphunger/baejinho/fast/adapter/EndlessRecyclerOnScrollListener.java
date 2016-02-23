package com.apphunger.baejinho.fast.adapter;

import android.support.v7.widget.RecyclerView;

/**
 * Created by baejinho on 2016. 2. 16..
 */
public abstract class EndlessRecyclerOnScrollListener extends RecyclerView.OnScrollListener {
    public static String TAG = EndlessRecyclerOnScrollListener.class.getSimpleName();

    private int previousTotal = 0; // The total number of items in the dataset after the last load
    private boolean loading = true; // True if we are still waiting for the last set of data to load.
    private int visibleThreshold = 5; // The minimum amount of items to have below your current scroll position before loading more.
    int firstVisibleItem, visibleItemCount, totalItemCount;

    private int current_page = 1;

    private RecyclerView.LayoutManager mLinearLayoutManager;

    public EndlessRecyclerOnScrollListener(RecyclerView.LayoutManager linearLayoutManager) {
        this.mLinearLayoutManager = linearLayoutManager;
        System.out.println("TestA1");
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        System.out.println("TestA2");
        visibleItemCount = recyclerView.getChildCount();
        totalItemCount = mLinearLayoutManager.getItemCount();
        //firstVisibleItem = mLinearLayoutManager.findViewByPosition(0);

        if (loading) {
            System.out.println("TestA3");
            if (totalItemCount > previousTotal) {
                loading = false;
                previousTotal = totalItemCount;
            }
        }
        if (!loading && (totalItemCount - visibleItemCount)
                <= (firstVisibleItem + visibleThreshold)) {
            // End has been reached
            System.out.println("TestA4");
            // Do something
            current_page++;

            onLoadMore(current_page);

            loading = true;
        }
    }

    public abstract void onLoadMore(int current_page);
}