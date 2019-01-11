package com.route.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    TextView resTextView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        resTextView = findViewById(R.id.res);
    }

    public void onNumberClicked(View view){
        String text = ((Button) view).getText().toString();
        resTextView.setText(resTextView.getText().toString()+text);
    }
    public void onEqualsCilcked(View view){

        String resText = resTextView.getText().toString();
        String LHS="",RHS= "";
        char op=' ';

        for(int i =0;i<resText.length();i++){
            char c = resText.charAt(i);
            if(c >='0'&&c<='9'){
                if(op==' ')
                    LHS=LHS+c;
                else RHS=RHS+c;
            }else
                op=c;
        }

        CalculateResult(LHS,RHS,op);
    }
    public void CalculateResult(String LHS,String RHS,char op){
        int n1 = Integer.parseInt(LHS);
        int n2= Integer.parseInt(RHS);
        int res = 0;
        Log.e("res",res+"");
        if(op=='+'){
            res= n1+n2;
        }else if(op=='-'){
            res= n1-n2;

        }else if(op=='*'){
            res= n1*n2;

        }else if(op=='/'){
            if(n2==0){
                resTextView.setText("error division on zero");
                return;
            }
            res= n1/n2;
        }

        resTextView.setText(res+"");
    }
}
