package com.example.anuj1.broadspire.Activity.activity.Activities.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anuj1.broadspire.R;

/**
 * Created by Anuj1 on 4/27/2016.
 */
public class CardViewDataAdapter extends RecyclerView.Adapter<CardViewDataAdapter.ViewHolder> {
    public String[] mDataset;
    Integer[] imageId = {
            R.drawable.expand_icon, R.drawable.expand_icon, R.drawable.expand_icon, R.drawable.expand_icon,
            R.drawable.expand_icon, R.drawable.expand_icon, R.drawable.expand_icon, R.drawable.expand_icon

    };

    // int item[] = new int[]{Color.RED,Color.GREEN,Color.BLUE,Color.RED};
    // Provide a suitable constructor (depends on the kind of dataset)
    public CardViewDataAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    public int[] contentIds = {11, 12, 13, 14};
    public String[] contents = {"The Broadspire Best Practice Health Ticket is a claims communication tool that relays all of the information relevant to a claims transaction.",
            "• Reduction in medical claims costs\n• Increased PPO Penetration\n• Increased Ancillary Partner Penetration\n• Increased PBM Penetration\n• Co-design by Client. jurisdiction, etc\n• Generated: via the web by employers",
            "To find out more about the Best Practice health ticket contact your Broadspire representative. or email customer_relations@choosebroadspire.com.",
            "You can view your health ticket right on your cell phone. Available on most web-enabled handsets through all carriers.",
            "We had a 21% increase in penetration in our Pharmacy Network\n\nWe have seen a significant jump in PPO penetration- and In some cases, as high as 10 points"};

    // Create new views (invoked by the layout manager)
    @Override
    public CardViewDataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.cardview_row, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.tvtinfo_text.setText(mDataset[position].toString());
        viewHolder.imageView.setImageResource(imageId[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvtinfo_text;

        public ImageView imageView;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            tvtinfo_text = (TextView) itemLayoutView
                    .findViewById(R.id.Question);

            imageView = (ImageView) itemLayoutView.findViewById(R.id.icon);


        }
    }

}

