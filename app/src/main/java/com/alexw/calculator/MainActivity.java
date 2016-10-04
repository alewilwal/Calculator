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

        Button btnC = (Button) findViewById(R.id.btn_c);

        Button btn9 = (Button) findViewById(R.id.btn_9);
        Button btn8 = (Button) findViewById(R.id.btn_8);
        Button btn7 = (Button) findViewById(R.id.btn_7);
        Button btn6 = (Button) findViewById(R.id.btn_6);
        Button btn5 = (Button) findViewById(R.id.btn_5);
        Button btn4 = (Button) findViewById(R.id.btn_4);
        Button btn3 = (Button) findViewById(R.id.btn_3);
        Button btn2 = (Button) findViewById(R.id.btn_2);
        Button btn1 = (Button) findViewById(R.id.btn_1);
        Button btn0 = (Button) findViewById(R.id.btn_0);

        Button btnDivide = (Button) findViewById(R.id.btn_divide);
        Button btnMultiply = (Button) findViewById(R.id.btn_multiply);
        Button btnLess = (Button) findViewById(R.id.btn_less);
        Button btnMore = (Button) findViewById(R.id.btn_more);
        Button btnComma = (Button) findViewById(R.id.btn_comma);
        Button btnEqual = (Button) findViewById(R.id.btn_equal);

        String stringCal = new String();



    }



}
