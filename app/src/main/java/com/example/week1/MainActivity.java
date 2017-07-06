package com.example.week1;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

import layout.TabPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Adding Toolbar to the activity
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Initializing the TabLayout
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.timeline_selector));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.people_selector));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.alarm_selector));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.bar_selector));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing ViewPager
        viewPager = (ViewPager)findViewById(R.id.pager);

        // Creating TabPagerAdapter adapter
        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        // Set TabSelectedListener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
