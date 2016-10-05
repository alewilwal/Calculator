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


        btnC.setTag("C");
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

            StringBuffer stringBuffCal = new StringBuffer();
            String stringDisplay = new String();

            @Override
            public void onClick(View v) {

                String myTag = (String) v.getTag();

                // add comma but not dot for calculate at stringBuffCal
                if(myTag.equals(",")){
                    stringBuffCal.append(".");
                }
                // add all tag without equal and comma tags
                if(!myTag.equals("=") && !myTag.equals(",")){
                    stringBuffCal.append(myTag);
                }



                // clear stringBuffCal and copy stringBuffCal to stringDisplay
                if(myTag.equals("C")){
                    stringBuffCal.setLength(0);
                    stringDisplay = stringBuffCal.toString();
                }
                // execute class ExecuteCal() when touch equal and copy stringBuffCal to stringDisplay
                else if(myTag.equals("=")){
                    ExecuteCal executeCal = new ExecuteCal();
                    stringDisplay = executeCal.strExecuteCal(stringBuffCal.toString());
                }
                // copy stringBuffCal to stringDisplay
                else{
                    stringDisplay = stringBuffCal.toString();
                }
                // display stringBuffCal in app
                textViewCal.setText(stringDisplay);

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
