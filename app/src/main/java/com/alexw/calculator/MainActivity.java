package com.alexw.calculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/*
http://techblogon.com/communication-between-activity-and-fragment-example/
 */


public class MainActivity extends Activity implements SimpleFragment.CommunicationChannel {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    @Override
    public void setCommunication(String msg)
    {
        // TODO Auto-generated method stub
        ResultFragment recFragment = (ResultFragment)getFragmentManager().findFragmentById(R.id.fragment_result);
        if(null != recFragment  && recFragment.isInLayout())
        {
            recFragment.setReceivedText(msg);

        }

    }




}
