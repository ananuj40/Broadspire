package com.example.anuj1.broadspire.Activity.activity.Activities.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.anuj1.broadspire.R;

/**
 * Created by Anuj1 on 4/27/2016.
 */
public class Contact_Adjuster extends AppCompatActivity {
    Button close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__adjuster);

        close = (Button) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Menu_Activity.class);
                startActivity(intent);
            }
        });
    }
}
