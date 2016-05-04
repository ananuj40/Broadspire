package com.example.anuj1.broadspire.Activity.activity.Activities.common;

import android.support.v4.app.FragmentManager;
import android.widget.EditText;
import com.github.jjobes.slidedatetimepicker.SlideDateTimeListener;
import com.github.jjobes.slidedatetimepicker.SlideDateTimePicker;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Calendar {
    // This is Calendar Dialog
    SlideDateTimeListener listener;
    private SimpleDateFormat mFormatter = new SimpleDateFormat("MMMM dd yyyy");

    void setDate(final EditText selectedTextDate) {
        listener = new SlideDateTimeListener() {
            @Override
            public void onDateTimeSet(Date date) {
                selectedTextDate.setText(mFormatter.format(date));
            }

            // Optional cancel listener
            @Override
            public void onDateTimeCancel() {
            }
        };
    }


    public Calendar(EditText txtDate, FragmentManager manager) {
        setDate(txtDate);
        new SlideDateTimePicker.Builder(manager)
                .setListener(listener)
                .setInitialDate(new Date())
                //.setMinDate(clearDate)
                //.setMaxDate(maxDate)
                //.setIs24HourTime(true)
                //.setTheme(SlideDateTimePicker.HOLO_DARK)
                //.setIndicatorColor(Color.parseColor("#990000"))
                .build()
                .show();
    }
}
