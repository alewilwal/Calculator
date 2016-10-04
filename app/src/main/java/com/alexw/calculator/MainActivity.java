package com.alexw.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewCal = (TextView) findViewById(R.id.text_view_cal);

        final Button btnC = (Button) findViewById(R.id.btn_c);

        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn0 = (Button) findViewById(R.id.btn_0);

        final Button btnDiv = (Button) findViewById(R.id.btn_div);
        final Button btnMult = (Button) findViewById(R.id.btn_mult);
        final Button btnSub = (Button) findViewById(R.id.btn_sub);
        final Button btnAdd = (Button) findViewById(R.id.btn_add);
        final Button btnComma = (Button) findViewById(R.id.btn_comma);
        final Button btnEqual = (Button) findViewById(R.id.btn_equal);


        View.OnClickListener myListenner = new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                StringBuffer stringBuffCal = new StringBuffer();

                textViewCal.setText(btn1.getText());
            }
        };


        btnDiv.setOnClickListener(myListenner);
        btnMult.setOnClickListener(myListenner);
        btnSub.setOnClickListener(myListenner);
        btnAdd.setOnClickListener(myListenner);
        btnComma.setOnClickListener(myListenner);
        btnEqual.setOnClickListener(myListenner);

        btnC.setOnClickListener(myListenner);

        btn0.setOnClickListener(myListenner);
        btn1.setOnClickListener(myListenner);
        btn2.setOnClickListener(myListenner);
        btn3.setOnClickListener(myListenner);
        btn4.setOnClickListener(myListenner);
        btn5.setOnClickListener(myListenner);
        btn6.setOnClickListener(myListenner);
        btn7.setOnClickListener(myListenner);
        btn8.setOnClickListener(myListenner);
        btn9.setOnClickListener(myListenner);


    }








}
