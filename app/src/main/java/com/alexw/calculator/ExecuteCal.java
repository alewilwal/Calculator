package com.alexw.calculator;

import android.app.Fragment;
import android.util.Log;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 05/10/2016.
 */
public class ExecuteCal extends Fragment{

    float sum = new Float(0);
    String operator = new String();

    public void strAddCal(String stringCal) {
        operator = "+";
        //sum = stringCal;
    }



    public String strExecuteCal(String stringCal) {

        StringBuffer stringBuffCal = new StringBuffer();

        boolean operatorAlready = new Boolean(true);
        String catchSecondOp = new String();
        Log.e(stringCal, "SSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        //if(stringCal.length()>1){}

        if (operatorAlready == true){
            StringTokenizer tokens = new StringTokenizer(stringCal, "+");
            String firstNumber = tokens.nextToken();
            String secondNumber = tokens.nextToken();
            sum = Float.parseFloat(firstNumber.toString()) + Float.parseFloat(secondNumber.toString());
            stringBuffCal.append(sum);
            operatorAlready = false;
            return stringBuffCal.toString();
        }
        else {
            stringBuffCal.append(stringCal);
            stringBuffCal.append("+");
            operatorAlready = true;
            return stringBuffCal.toString();
        }


    }


}