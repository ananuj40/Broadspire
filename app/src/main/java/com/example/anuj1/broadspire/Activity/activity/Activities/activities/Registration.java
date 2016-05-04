package com.example.anuj1.broadspire.Activity.activity.Activities.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.anuj1.broadspire.Activity.activity.Activities.adapters.Registration_Adapter;
import com.example.anuj1.broadspire.Activity.activity.Activities.common.CreateViewPager_CircleIndicator;
import com.example.anuj1.broadspire.R;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akhilesh on 4/27/2016.
 */


public class Registration extends AppCompatActivity {
   private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        modifyActionBar();

        List<View> list = new ArrayList<View>();
        list.add(LayoutInflater.from(this).inflate(R.layout.registrationview1, null));
        list.add(LayoutInflater.from(this).inflate(R.layout.registrationview2, null));
        list.add(LayoutInflater.from(this).inflate(R.layout.registrationview3, null));

        Registration_Adapter adapter = new Registration_Adapter(list);
        viewPager = (ViewPager) findViewById(R.id.viewrpager);
        new CreateViewPager_CircleIndicator().generateViewPager(viewPager, adapter);

        //create circle indicator on viewpager
        CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.indicator);
        CreateViewPager_CircleIndicator.createViewPagerCircleIndicator(getApplicationContext(), indicator, viewPager);

    }

    public void modifyActionBar() {
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.broadspire_logo_white);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setTitle(Html.fromHtml("<Small>Registration</Small>"));
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);
    }

   /* // change page in viewpager
    public void jumpToPage(View view) {
        int position = new CreateViewPager_CircleIndicator().getPosition();
        viewPager.setCurrentItem(position + 1, true);
    }*/

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.info);
        menuItem.setVisible(false);
        return true;
    }


}

