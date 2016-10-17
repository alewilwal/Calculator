package com.alexw.calculator;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Human Booster on 10/10/2016.
 *
 * http://stackoverflow.com/questions/12124011/how-do-i-handle-callbacks-for-multiple-buttons
 */

public class SimpleFragment extends Fragment {

    CommunicationChannel mCommChListner = null;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view2 = inflater.inflate(R.layout.fragment_simple, container, false);

        Button btn9 = (Button) view2.findViewById(R.id.btn_9);
        Button btn8 = (Button) view2.findViewById(R.id.btn_8);
        Button btn7 = (Button) view2.findViewById(R.id.btn_7);
        Button btn6 = (Button) view2.findViewById(R.id.btn_6);
        Button btn5 = (Button) view2.findViewById(R.id.btn_5);
        Button btn4 = (Button) view2.findViewById(R.id.btn_4);
        Button btn3 = (Button) view2.findViewById(R.id.btn_3);
        Button btn2 = (Button) view2.findViewById(R.id.btn_2);
        Button btn1 = (Button) view2.findViewById(R.id.btn_1);
        Button btn0 = (Button) view2.findViewById(R.id.btn_0);

        Button btnDiv = (Button) view2.findViewById(R.id.btn_div);
        Button btnMult = (Button) view2.findViewById(R.id.btn_mult);
        Button btnSub = (Button) view2.findViewById(R.id.btn_sub);
        Button btnAdd = (Button) view2.findViewById(R.id.btn_add);
        Button btnComma = (Button) view2.findViewById(R.id.btn_comma);


        final String stringDisplay = new String();
        final StringBuffer stringBuffCal = new StringBuffer();
        final TextView _screen;


        btn9.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("9");
                sendMessage(stringDisplay);
            }
        });
        btn8.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("8");
                sendMessage(stringBuffCal.toString());
            }
        });
        btn7.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("7");
                sendMessage(stringBuffCal.toString());
            }
        });
        btn6.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("6");
                sendMessage(stringBuffCal.toString());
            }
        });
        btn5.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("5");
                sendMessage(stringBuffCal.toString());
            }
        });
        btn4.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("4");
                sendMessage(stringBuffCal.toString());
            }
        });
        btn3.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("3");
                sendMessage(stringBuffCal.toString());
            }
        });
        btn2.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("2");
                sendMessage(stringBuffCal.toString());
            }
        });
        btn1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("1");
                sendMessage(stringBuffCal.toString());
            }
        });
        btn0.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("0");
                sendMessage(stringBuffCal.toString());
            }
        });


        btnDiv.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("/");
                sendMessage(stringBuffCal.toString());
            }
        });
        btnMult.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("x");
                sendMessage(stringBuffCal.toString());
            }
        });
        btnSub.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("-");
                String stringDisplay = stringBuffCal.toString();
                sendMessage(stringDisplay);
            }
        });
        btnAdd.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append("+");
                String stringDisplay = stringBuffCal.toString();
                ExecuteCal executeCal = new ExecuteCal();
                executeCal.strAddCal("2+2+");
                Log.e(stringBuffCal.toString(), "stringBuffCal");
                Log.e(stringDisplay, "stringDisplay");
                sendMessage(stringBuffCal.toString());
            }
        });
        btnComma.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                stringBuffCal.append(",");
                sendMessage(stringBuffCal.toString());
            }
        });

/*
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stringDisplay = new String();
                StringBuffer stringBuffCal = new StringBuffer();

                Button btnC = (Button) getActivity().findViewById(R.id.btn_c);

                Button btn9 = (Button) getActivity().findViewById(R.id.btn_9);
                Button btn8 = (Button) getActivity().findViewById(R.id.btn_8);
                Button btn7 = (Button) getActivity().findViewById(R.id.btn_7);
                Button btn6 = (Button) getActivity().findViewById(R.id.btn_6);
                Button btn5 = (Button) getActivity().findViewById(R.id.btn_5);
                Button btn4 = (Button) getActivity().findViewById(R.id.btn_4);
                Button btn3 = (Button) getActivity().findViewById(R.id.btn_3);
                Button btn2 = (Button) getActivity().findViewById(R.id.btn_2);
                Button btn1 = (Button) getActivity().findViewById(R.id.btn_1);
                Button btn0 = (Button) getActivity().findViewById(R.id.btn_0);

                Button btnDiv = (Button) getActivity().findViewById(R.id.btn_div);
                Button btnMult = (Button) getActivity().findViewById(R.id.btn_mult);
                Button btnSub = (Button) getActivity().findViewById(R.id.btn_sub);
                Button btnAdd = (Button) getActivity().findViewById(R.id.btn_add);
                Button btnComma = (Button) getActivity().findViewById(R.id.btn_comma);

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

                String myTag = (String) v.getTag();

                if (!myTag.equals("+") || !myTag.equals("-") || !myTag.equals("x") || !myTag.equals("/") || !myTag.equals("C") || !myTag.equals(",") || !myTag.equals("=")) {
                    stringBuffCal.append(myTag);
                    stringDisplay = stringBuffCal.toString();

                }
                if (myTag.equals("+")) {
                    //ExecuteCal executeCal = new ExecuteCal();
                    //stringDisplay = executeCal.strAddCal(stringDisplay);

                }
                if (myTag.equals(",")) {
                    stringBuffCal.append(".");
                }

                // display stringBuffCal in app
                //textViewCal.setText(stringDisplay);
                //String str = editText.getText().toString();
                Log.e(stringDisplay, "-----------------**************-----------");
                sendMessage(stringDisplay);

            }
        });*/



        return view2;
    }


    //create an interface which will help us to communicate with fragments by help of Activity
    interface CommunicationChannel {
        public void setCommunication(String msg);
    }


    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if(activity instanceof CommunicationChannel) {
            mCommChListner = (CommunicationChannel)activity;
        }
        else {
            throw new ClassCastException();
        }

    }
    private void sendMessage(String msg) {
        mCommChListner.setCommunication(msg);

    }
}