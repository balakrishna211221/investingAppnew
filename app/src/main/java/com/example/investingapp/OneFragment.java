package com.example.investingapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class OneFragment extends Fragment {

    ListView listView;
    String indicesarraynames[]={"Nifty Bank","Nifty 50","SNAP" };
    String curentvalues[]={"501664","412583","145244"};



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.one,container,false);












        return view;
    }
}
