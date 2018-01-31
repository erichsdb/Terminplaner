package com.example.admin.terminplaner;

import android.os.Bundle;
import android.view.View;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class ReminderListFragment extends ListFragment{
    private ListAdapter mAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        String[] items = new String[] {"Foo", "Bar", "Fizz", "Bin"};

        mAdapter = new ArrayAdapter<String>(getActivity(),R.layout.reminder_row, R.id.text1, items);
        setListAdapter(mAdapter);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        setEmptyText(getResources().getString(R.string.no_reminders));
    }



}

