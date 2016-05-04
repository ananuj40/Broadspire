package com.example.anuj1.broadspire.Activity.activity.Activities.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.example.anuj1.broadspire.Activity.activity.Activities.adapters.HealthTicketPageAdapter;
import com.example.anuj1.broadspire.R;

/**
 * Created by Anuj1 on 4/27/2016.
 */
public class HealthTicket extends AppCompatActivity implements
        ActionBar.TabListener {

    private ViewPager viewPager;
    private HealthTicketPageAdapter mAdapter;
    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = {"Prescription Drug ID Card", "Pharmacy Information"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_ticket);

        // Initilization
        viewPager = (ViewPager) findViewById(R.id.pager2);
        actionBar = getSupportActionBar();
        mAdapter = new HealthTicketPageAdapter(getSupportFragmentManager());

        viewPager.setAdapter(mAdapter);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Adding Tabs
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }

        /**
         * on swiping the viewpager make respective tab selected
         * */
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                // on changing the page
                // make respected tab selected
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }
}
