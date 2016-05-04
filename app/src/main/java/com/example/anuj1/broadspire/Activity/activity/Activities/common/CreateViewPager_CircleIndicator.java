package com.example.anuj1.broadspire.Activity.activity.Activities.common;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.CirclePageIndicator;

/**
 * Created by Akhilesh on 4/29/2016.
 */
public class CreateViewPager_CircleIndicator {
    static int position2;

    public void generateViewPager(ViewPager viewPager, Object AdapterClass) {

        viewPager.setAdapter((PagerAdapter) AdapterClass);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                position2 = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    // return position of the current page in viewpager
    public int getPosition() {
        return position2;
    }

    public static void createViewPagerCircleIndicator(Context context, CirclePageIndicator indicator, ViewPager viewPager) {

        indicator.setViewPager(viewPager);
        final float density = context.getResources().getDisplayMetrics().density;

        //Set circle indicator radius
        indicator.setRadius(6 * density);
    }

}

