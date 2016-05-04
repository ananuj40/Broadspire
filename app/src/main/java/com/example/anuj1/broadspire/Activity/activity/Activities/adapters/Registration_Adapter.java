package com.example.anuj1.broadspire.Activity.activity.Activities.adapters;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;

/**
 * Created by Akhilesh on 4/27/2016.
 */

public class Registration_Adapter extends PagerAdapter {
    private List<View> list;

    public Registration_Adapter(List<View> list) {
        this.list = list;
    }

    @Override
    public Object instantiateItem(View container, int position) {
        ((ViewPager) container).addView(list.get(position));
        return list.get(position);
    }

    //The destruction of page card
    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView(list.get(position));
    }

    //Get all the pages card number
    @Override
    public int getCount() {
        return list.size();
    }

    //To judge whether the currently displayed page card matching
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }
}

