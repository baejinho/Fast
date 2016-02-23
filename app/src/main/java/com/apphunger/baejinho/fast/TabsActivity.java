package com.apphunger.baejinho.fast;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class TabsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);



        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        //tabLayout.setOnDragListener(new );
        //tabLayout.setOnTabSelectedListener();
        setupTabIcons();
    }

    /**
     * Adding custom view to tab
     */
    private void setupTabIcons() {
/*
        //TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabOne.setText("BEST BOOK");

        //tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.widget01, 0, 0);
        ImageView tabOne = (ImageView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setBackgroundResource(R.drawable.widget01);

        tabLayout.getTabAt(0).setCustomView(tabOne);

        //TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabTwo.setText("Friend");
        //tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.widget02, 0, 0);
        ImageView tabTwo = (ImageView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setBackgroundResource(R.drawable.widget02);

        tabLayout.getTabAt(1).setCustomView(tabTwo);

        //TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabThree.setText("Location");
        //tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.widget03, 0, 0);
        ImageView tabThree = (ImageView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setBackgroundResource(R.drawable.widget03);

        tabLayout.getTabAt(2).setCustomView(tabThree);

        //TextView tabFour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabThree.setText("Photo");
        //tabFour.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.widget04, 0, 0);
        ImageView tabFour = (ImageView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabFour.setBackgroundResource(R.drawable.widget04);

        tabLayout.getTabAt(3).setCustomView(tabFour);
*/
        /*
        TextView tabFive = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabThree.setText("Setting");
        tabFive.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.widget05, 0, 0);
        tabLayout.getTabAt(4).setCustomView(tabFive);
        */

    }

    /**
     * Adding fragments to ViewPager
     * @param viewPager
     */
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new OneFragment(), "ONE");
        adapter.addFrag(new TwoFragment(), "TWO");
        adapter.addFrag(new ThreeFragment(), "THREE");
        adapter.addFrag(new FourFragment(), "FOUR");
        //adapter.addFrag(new OneFragment(), "ONE");
        //adapter.addFrag(new FiveFragment(), "FIVE");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
