package com.example.anuj1.broadspire.Activity.activity.Activities.common;

/**
 * Created by Akhilesh on 5/4/2016.
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class HideShowCollapsibles {
    public HideShowCollapsibles(LinearLayout collapseLayout, int childCount) {
        final View nextChild = ((ViewGroup)collapseLayout).getChildAt(childCount);
        nextChild.setVisibility(nextChild.isShown()
                ? View.GONE
                : View.VISIBLE);
    }

}

