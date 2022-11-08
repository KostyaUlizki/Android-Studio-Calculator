package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    int num1,num2;
    char sym = ' ';
    String str="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result = findViewById(R.id.textResult);

    }

    public void funcButton(View view) {

        Button b = (Button) view;

        if(b.getText().equals("+")){
            sym = '+';
            result.setText("");
            num1 = Integer.parseInt(str);
            str = "";
        }
        else if(b.getText().equals("-")){
            if(str.isEmpty()){ // ability to have negative numbers 
                str+= "-";
            }
            else{
                sym = '-';
                result.setText("");
                num1 = Integer.parseInt(str);
                str = "";
            }

        }
        else if(b.getText().equals("X")){
            sym = '*';
            result.setText("");
            num1 = Integer.parseInt(str);
            str = "";
        }
        else if(b.getText().equals("/")){
            sym = '/';
            result.setText("");
            num1 = Integer.parseInt(str);
            str = "";
        }
        else if(b.getText().equals("=")){
            String res;
            num2 = Integer.parseInt(str);
            char c = sym;
            switch (c) {
                case '+':
                    res = Integer.toString(num1 + num2);
                    result.setText(res);
                    str = "";
                    break;
                case '-':
                    res = Integer.toString(num1 - num2);
                    result.setText(res);
                    str = "";
                    break;
                case '*':
                    res = Integer.toString(num1 * num2);
                    result.setText(res);
                    str = "";
                    break;
                case '/':
                    res = Integer.toString(num1 / num2);
                    result.setText(res);
                    str = "";
                    break;
            }
        }
        else{
            str+= b.getText();
            result.setText(str);
        }



    }



}