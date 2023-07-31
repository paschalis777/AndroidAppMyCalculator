package com.example.mycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText NumberDecimal;

    double num1 = 0;
    double num2 = 0;


    char op = ' ';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberDecimal = findViewById(R.id.NumberDecimal);

        Button btn_0 = findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        Button btn_min = findViewById(R.id.btnmin);
        btn_min.setOnClickListener(this);
        Button btn_add = findViewById(R.id.btnadd);
        btn_add.setOnClickListener(this);
        Button btn_equ = findViewById(R.id.btnequ);
        btn_equ.setOnClickListener(this);
        Button btn_clr = findViewById(R.id.btnClr);
        btn_clr.setOnClickListener(this);
        Button btn_mul = findViewById(R.id.btnmul);
        btn_mul.setOnClickListener(this);
        Button btn_div = findViewById(R.id.btndiv);
        btn_div.setOnClickListener(this);
        Button btn_dot = findViewById(R.id.btn_dot);
        btn_dot.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String strNum = NumberDecimal.getText().toString();
        if (v.getId() == R.id.btn_0) {
            NumberDecimal.setText(strNum + "0");
        } else if (v.getId() == R.id.btn1) {
            NumberDecimal.setText(strNum + "1");
        } else if (v.getId() == R.id.btn2) {
            NumberDecimal.setText(strNum + "2");
        } else if (v.getId() == R.id.btn3) {
            NumberDecimal.setText(strNum + "3");
        } else if (v.getId() == R.id.btn4) {
            NumberDecimal.setText(strNum + "4");
        } else if (v.getId() == R.id.btn5) {
            NumberDecimal.setText(strNum + "5");
        } else if (v.getId() == R.id.btn6) {
            NumberDecimal.setText(strNum + "6");
        } else if (v.getId() == R.id.btn7) {
            NumberDecimal.setText(strNum + "7");
        } else if (v.getId() == R.id.btn8) {
            NumberDecimal.setText(strNum + "8");
        } else if (v.getId() == R.id.btn9) {
            NumberDecimal.setText(strNum + "9");
        } else if (v.getId() == R.id.btnmin) {
            num1 = Double.parseDouble(strNum);
            op = '-';
            NumberDecimal.setText("");
        } else if (v.getId() == R.id.btnadd) {
            num1 = Double.parseDouble(strNum);
            op = '+';
            NumberDecimal.setText("");
        } else if (v.getId() == R.id.btnmul) {
            num1 = Double.parseDouble(strNum);
            op = '*';
            NumberDecimal.setText("");
        } else if (v.getId() == R.id.btndiv) {
            num1 = Double.parseDouble(strNum);
            op = '/';
            NumberDecimal.setText("");
        } else if (v.getId() == R.id.btn_dot) {
            // Check if the current text already contains a decimal point
            if (!strNum.contains(".")) {
                NumberDecimal.setText(strNum + ".");
            }
        } else if (v.getId() == R.id.btnClr) {
            NumberDecimal.setText("");
        } else if (v.getId() == R.id.btnequ) {
            if (op != ' ') {
                num2 = Double.parseDouble(strNum);
                double result = 0;
                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                NumberDecimal.setText(String.valueOf(result));
                num1 = result;
                num2 = 0;
                op = ' ';
            }
        }
    }
}