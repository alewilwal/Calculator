package com.alexw.calculator;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 05/10/2016.
 */
public class ExecuteCal extends MainActivity{

    float sum = new Float(0);
    String operator = new String();

    public void strAddCal(String stringCal) {
        operator = "+";
        //sum = stringCal;
    }



    public String strExecuteCal(String stringCal) {
/*
        StringBuffer stringBuffCal = new StringBuffer();

        boolean operatorAlready = new Boolean(false);
        String catchSecondOp = new String();



        if (stringCal.length()>1){
            StringTokenizer tokens = new StringTokenizer(stringCal, "+");
            String firstNumber = tokens.nextToken();
            String secondNumber = tokens.nextToken();
            sum = Float.parseFloat(firstNumber.toString()) + Float.parseFloat(secondNumber.toString());

        }*/
        return Float.toString(sum);

    }
}
