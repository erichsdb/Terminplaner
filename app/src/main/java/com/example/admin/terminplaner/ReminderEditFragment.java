package com.example.admin.terminplaner;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by admin on 29.12.2017.
 */

public class ReminderEditFragment extends Fragment{
    public static final String DEFAULT_EDIT_FRAGMENT_TAG = "editFragmentTag";

    private EditText mTitleText;
    private EditText mBodyText;
    private Button mDateButton;
    private Button mTimeButton;
    private Button mConfirmButton;
    private long mRowId;

    @Override
    public void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        Bundle arguments = getArguments();
        if(arguments != null){
            mRowId = arguments.getLong(ReminderProvider.COLUMN_ROWID);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.reminder_edit, container, false);

        mTitleText = (EditText) v.findViewById(R.id.title);
        mBodyText = (EditText) v.findViewById(R.id.body);
        mDateButton = (Button) v.findViewById(R.id.reminder_date);
        mTimeButton = (Button) v.findViewById(R.id.reminder_time);

        return v;
    }
}
