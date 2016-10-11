package com.alexw.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*
        Button.btnC.setTag("C");
        btn9.setTag("9");
        btn8.setTag("8");
        btn7.setTag("7");
        btn6.setTag("6");
        btn5.setTag("5");
        btn4.setTag("4");
        btn3.setTag("3");
        btn2.setTag("2");
        btn1.setTag("1");
        btn0.setTag("0");
        btnDiv.setTag("/");
        btnMult.setTag("x");
        btnSub.setTag("-");
        btnAdd.setTag("+");
        btnComma.setTag(",");
        btnEqual.setTag("=");


        View.OnClickListener myListenner = new View.OnClickListener(){

            String stringDisplay = new String();
            StringBuffer stringBuffCal = new StringBuffer();

            @Override
            public void onClick(View v) {

                String myTag = (String) v.getTag();

                if (!myTag.equals("+") || !myTag.equals("-") || !myTag.equals("x") || !myTag.equals("/") || !myTag.equals("C") || !myTag.equals(",") || !myTag.equals("=")) {
                    stringBuffCal.append(myTag);
                    stringDisplay = stringBuffCal.toString();

                }
                if (myTag.equals("+")) {

                    ExecuteCal executeCal = new ExecuteCal();
                    stringDisplay = executeCal.strAddCal(stringDisplay);


                }
                if (myTag.equals(",")) {
                    stringBuffCal.append(".");
                }



                // display stringBuffCal in app
                textViewCal.setText(stringDisplay);

            }
        };
*/



    }

}
