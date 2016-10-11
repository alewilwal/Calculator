package com.alexw.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Human Booster on 10/10/2016.
 */

public class SimpleFragment extends Fragment {

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view2 = inflater.inflate(R.layout.fragment_simple, container, false);


          /*
        final TextView textViewCal = (TextView) getView().findViewById(R.id.text_view_cal);

        final Button btnC = (Button) getView().findViewById(R.id.btn_c);

        final Button btn9 = (Button) getView().findViewById(R.id.btn_9);
        final Button btn8 = (Button) getView().findViewById(R.id.btn_8);
        final Button btn7 = (Button) getView().findViewById(R.id.btn_7);
        final Button btn6 = (Button) getView().findViewById(R.id.btn_6);
        final Button btn5 = (Button) getView().findViewById(R.id.btn_5);
        final Button btn4 = (Button) getView().findViewById(R.id.btn_4);
        final Button btn3 = (Button) getView().findViewById(R.id.btn_3);
        final Button btn2 = (Button) getView().findViewById(R.id.btn_2);
        final Button btn1 = (Button) getView().findViewById(R.id.btn_1);
        final Button btn0 = (Button) getView().findViewById(R.id.btn_0);

        final Button btnDiv = (Button) getView().findViewById(R.id.btn_div);
        final Button btnMult = (Button) getView().findViewById(R.id.btn_mult);
        final Button btnSub = (Button) getView().findViewById(R.id.btn_sub);
        final Button btnAdd = (Button) getView().findViewById(R.id.btn_add);
        final Button btnComma = (Button) getView().findViewById(R.id.btn_comma);
        final Button btnEqual = (Button) getView().findViewById(R.id.btn_equal);



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

*/




        return view2;
    }

/*

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

        };
    */


}
