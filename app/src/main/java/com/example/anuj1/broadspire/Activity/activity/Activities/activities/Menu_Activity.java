package com.example.anuj1.broadspire.Activity.activity.Activities.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.anuj1.broadspire.R;

/**
 * Created by Anuj1 on 4/27/2016.
 */
public class Menu_Activity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ImageView claim_PaymentInfo, Contact, health, socialMedia, faq, locatePhysician;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final String[] myDataset = {"CLAIM/PAYMENT INFO", "HEALTH TICKET", "CONTACT ADJUSTER", "PHYSICIAN/PHARMACY LOOKUP", "FAQ",
                "SOCIAL MEDIA", "TUTORIAL", "SETTINGS"};


        locatePhysician = (ImageView) findViewById(R.id.physician);
        addListener(locatePhysician, LocatePhysician.class);

        faq = (ImageView) findViewById(R.id.faq);
        addListener(faq, FAQ.class);

        claim_PaymentInfo = (ImageView) findViewById(R.id.claim);
        addListener(claim_PaymentInfo, Claim_PaymentInfo_Activity.class);

        Contact = (ImageView) findViewById(R.id.contact);
        addListener(Contact, Contact_Adjuster.class);

        socialMedia = (ImageView) findViewById(R.id.social);
        addListener(socialMedia, SocialMedia.class);

        health = (ImageView) findViewById(R.id.health);
        addListener(health, HealthTicket.class);

    }


    // add Click Listener to images in Menu Page
    public void addListener(ImageView menuItemImage, final Class MenuItemClass) {
        menuItemImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuItemClass);
                startActivity(intent);
            }
        });

    }
}
