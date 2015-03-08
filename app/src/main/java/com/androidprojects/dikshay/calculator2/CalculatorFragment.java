package com.androidprojects.dikshay.calculator2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonFlat;

import java.util.Stack;

/**
 * Created by Dikshay on 3/6/2015.
 */
public class CalculatorFragment extends Fragment {

    ButtonFlat b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdot,beq,bclear,bdelete;

    TextView et,resultTextView;
    boolean operatorInEnd = false;
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = layoutInflater.inflate(R.layout.calculatorfragment,container,false);

        b1 = (ButtonFlat)rootView.findViewById(R.id.button5);
        b2 = (ButtonFlat)rootView.findViewById(R.id.button6);
        b3 = (ButtonFlat)rootView.findViewById(R.id.button7);
        b4 = (ButtonFlat)rootView.findViewById(R.id.button9);
        b5 = (ButtonFlat)rootView.findViewById(R.id.button11);
        b6 = (ButtonFlat)rootView.findViewById(R.id.button13);
        b7 = (ButtonFlat)rootView.findViewById(R.id.button10);
        b8 = (ButtonFlat)rootView.findViewById(R.id.button12);
        b9 = (ButtonFlat)rootView.findViewById(R.id.button14);
        b0 = (ButtonFlat)rootView.findViewById(R.id.button1);
        bdot = (ButtonFlat)rootView.findViewById(R.id.button2);
        badd = (ButtonFlat)rootView.findViewById(R.id.button3);
        bsub = (ButtonFlat)rootView.findViewById(R.id.button15);
        bdiv = (ButtonFlat)rootView.findViewById(R.id.button16);
        bmul = (ButtonFlat)rootView.findViewById(R.id.button8);
        beq = (ButtonFlat)rootView.findViewById(R.id.button4);
        bclear = (ButtonFlat)rootView.findViewById(R.id.clear);
        bdelete = (ButtonFlat)rootView.findViewById(R.id.delete);
        et = (TextView)rootView.findViewById(R.id.editText2);
        resultTextView  = (TextView)rootView.findViewById(R.id.editText1);
        bclear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText("");
            }
        });
        bdelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String displayText = et.getText() + "";
                if(displayText==null || displayText.length()==0)
                {

                }else{
                et.setText(displayText.substring(0,displayText.length()-1));}
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operatorInEnd = false;
                et.setText(et.getText() + "0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText() + ".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               /* val1 = Integer.parseInt(et.getText() + "");
                add = true;
                et.setText(null);*/
                operatorInEnd = true;
                et.setText(et.getText() + " + ");
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
              /*  val1 = Integer.parseInt(et.getText() + "");
                sub = true;
                et.setText(null);*/
                operatorInEnd = true;
                et.setText(et.getText() + " - ");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               /* val1 = Integer.parseInt(et.getText() + "");
                mul = true;
                et.setText(null);*/
                operatorInEnd = true;
                et.setText(et.getText() + " * ");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               /* val1 = Integer.parseInt(et.getText() + "");
                div = true;
                et.setText(null);*/
                operatorInEnd = true;
                et.setText(et.getText() + " / ");
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               /* val2 = Integer.parseInt(et.getText() + "");
                if(add==true)
                {
                    et.setText(val1 + val2 + "");
                    add=false;
                }
                if(mul==true)
                {
                    et.setText(val1 * val2 + "");
                    mul=false;
                }
                if(sub==true)
                {
                    et.setText(val1 - val2 + "");
                    sub=false;
                }
                if(div==true)
                {
                    et.setText(val1/val2 + "");
                    div=false;
                }*/
                if(!operatorInEnd){
                    if(!(et.getText()+"").equals("."))
                            {
                double result = evaluateExpression(et.getText()+"");
                String resutlString;
                if(result == (long)result)
                {
                    resutlString = String.format("%d",(long)result);
                }
                 else
                {
                    resutlString = String.format("%s",result);
                }

                resultTextView.setText(resutlString);}
                }


            }
        });

        return rootView;
    }
    private Double evaluateExpression(String pExpression) {
        double Result;
        String lExpression = pExpression;
        Stack<Double> numbersStack = new Stack<Double>();
        Stack<Character> operandsStack = new Stack<Character>();
        String stringExpressionArray[] = lExpression.split(" ");
        for (int i = 0; i < stringExpressionArray.length; i++) {
            if (!checkIfOperand(stringExpressionArray[i])) {
                //it is a number
                numbersStack.push(Double.parseDouble(stringExpressionArray[i]));
            } else {
                //it is a operand
                char operand[] = stringExpressionArray[i].toCharArray();
                if (operandsStack.empty() || getPriority(operandsStack.peek()) < getPriority(operand[0])) {
                    operandsStack.push(operand[0]);
                } else {
                    while (!operandsStack.empty() && getPriority(operandsStack.peek()) >= getPriority(operand[0])) {
                        Double number1, number2;
                        Double temp_result;
                        Character operator;
                        number2 = numbersStack.pop();
                        number1 = numbersStack.pop();
                        operator = operandsStack.pop();
                        if (operator == '+') {
                            temp_result = number1 + number2;
                            numbersStack.push(temp_result);
                        } else if (operator == '-') {
                            temp_result = number1 - number2;
                            numbersStack.push(temp_result);
                        } else if (operator == '*') {
                            temp_result = number1 * number2;
                            numbersStack.push(temp_result);
                        } else if (operator == '/') {
                            temp_result = number1 / number2;
                            numbersStack.push(temp_result);
                        }


                    }
                    operandsStack.push(operand[0]);
                }
            }
        }
        while (!operandsStack.isEmpty()) {
            Double number1, number2, temp_result;
            Character operator;
            number2 = numbersStack.pop();
            number1 = numbersStack.pop();
            operator = operandsStack.pop();
            if (operator == '+') {
                temp_result = number1 + number2;
                numbersStack.push(temp_result);
            } else if (operator == '-') {
                temp_result = number1 - number2;
                numbersStack.push(temp_result);
            } else if (operator == '*') {
                temp_result = number1 * number2;
                numbersStack.push(temp_result);
            } else if (operator == '/') {
                temp_result = number1 / number2;
                numbersStack.push(temp_result);
            }
        }
        Result = numbersStack.pop();
        return Result;
    }
    private int getPriority(char operand)
    {
        switch(operand)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default :
                return 0;
        }
    }
    private boolean checkIfOperand(String pExpression)
    {
        String pattern = "[+-/*]";
        String lExpression = pExpression;
        if(lExpression.matches(pattern)){
        return true;
    } else
        {
            return false;
        }
    }

}




