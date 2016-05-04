package com.example.anuj1.broadspire.Activity.activity.Activities.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.anuj1.broadspire.Activity.activity.Activities.adapters.CardViewDataAdapter;
import com.example.anuj1.broadspire.Activity.activity.Activities.classes.RecyclerItemClickListener;
import com.example.anuj1.broadspire.R;

/**
 * Created by Anuj1 on 4/27/2016.
 */
public class FAQ extends ActionBarActivity {

    private Toolbar toolbar;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);


        final String[] myDataset = {"What is the Broadspire best Practice Health Ticket", "What are the benefits of the Broadpsire Best Practice Health Ticket?", "Interested in the Broadspire Best Practice Health Ticket?", "Get your Best Practice Health Ticket on the go!", "What clients are saying?"};

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // getSupportActionBar().setIcon(R.drawable.ic_launcher);

        // getSupportActionBar().setTitle("Android Versions");

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new CardViewDataAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        // Implementation of onItemClick RecycleView
        // http://stackoverflow.com/questions/24471109/recyclerview-onclick/26196831#26196831


        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        TextView nTv = new TextView(view.getContext());
                        final RelativeLayout layoutanswer = (RelativeLayout) view.findViewById(R.id.Relative_layout_answer);
                        final RelativeLayout layoutquestion = (RelativeLayout) view.findViewById(R.id.heading2);
                        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                        layoutanswer.addView(nTv);
                        ImageView expandCollapseIcon = new ImageView(view.getContext());
                        lp.setMargins(10, 10, 20, 10);
                        expandCollapseIcon.setLayoutParams(lp);
                        layoutquestion.addView(expandCollapseIcon);
                        CardViewDataAdapter adapter = new CardViewDataAdapter(myDataset);
                        String content3 = adapter.contents[position];
                        nTv.setText(content3);

                        Boolean visible = layoutanswer.isShown();
                        if (visible) {
                            layoutanswer.setVisibility(View.GONE);
                            //  expandCollapseIcon.setImageResource(R.drawable.expand_icon);
                        } else {
                            layoutanswer.setVisibility(View.VISIBLE);
                            //  expandCollapseIcon.setImageResource(R.drawable.collaspicon);
                        }

                        //    Toast.makeText(getApplicationContext() "Data : " + myDataset[position], Toast.LENGTH_SHORT).show();

                    }
                }));


    }

}