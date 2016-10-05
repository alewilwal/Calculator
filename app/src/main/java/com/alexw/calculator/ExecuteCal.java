package com.alexw.calculator;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 05/10/2016.
 */
public class ExecuteCal extends MainActivity{

    public String strExecuteCal(String stringCal) {

        float sum = 0;

        if (stringCal.length()>1){
            StringTokenizer tokens = new StringTokenizer(stringCal, "+");
            String firstNumber = tokens.nextToken();
            String secondNumber = tokens.nextToken();
            sum = Float.parseFloat(firstNumber.toString()) + Float.parseFloat(secondNumber.toString());

        }
        return Float.toString(sum);

    }
}
