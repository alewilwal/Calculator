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

public class ResultFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_result, container);
    }

    void setReceivedText(String msg)
    {
        TextView textView = (TextView) this.getView().findViewById(R.id.textView1);
        textView.setText(msg);
    }

}
