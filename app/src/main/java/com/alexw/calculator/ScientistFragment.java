package com.alexw.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Human Booster on 10/10/2016.
 */

public class ScientistFragment extends Fragment {

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scientist, container, false);

        //TextView viewTxt = (TextView) getView().findViewById(R.id.detailsText);

        return view; }


}
