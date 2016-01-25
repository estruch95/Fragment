package com.example.estruch18.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by estruch18 on 25/1/16.
 */
public class Fragment1 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Unflem el Layout amb el fragment 1
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

}
