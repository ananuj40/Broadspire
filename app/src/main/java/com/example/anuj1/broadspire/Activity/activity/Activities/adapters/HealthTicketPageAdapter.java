package com.example.anuj1.broadspire.Activity.activity.Activities.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.anuj1.broadspire.Activity.activity.Activities.fragments.Health_PharmacyInformation;
import com.example.anuj1.broadspire.Activity.activity.Activities.fragments.Health_PrescriptionDrug;

/**
 * Created by Anuj1 on 4/27/2016.
 */

public class HealthTicketPageAdapter extends FragmentPagerAdapter {

    public HealthTicketPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new Health_PrescriptionDrug();
            case 1:
                // Games fragment activity
                return new Health_PharmacyInformation();
        }
        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }


}