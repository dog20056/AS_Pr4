package com.example.as_pr4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText txt1;
    Double num;
    String num1;
    Long num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        txt1 = findViewById(R.id.editTextText);
        num = Math.random() * 100;
        num2 = Math.round(num);
        num1 = Long.toString(num2);


    }

    public void onClick(View v)
    {
        Integer resp = Integer.parseInt(txt1.getText().toString());
        Boolean n1 = false;
        if(txt1.getText().equals(""))
            Toast.makeText(MainActivity.this, "Введите число!", Toast.LENGTH_SHORT).show();
        else if(resp > num2.intValue())
            Toast.makeText(MainActivity.this, "Ваш ответ больше", Toast.LENGTH_SHORT).show();
        else if(resp < num2.intValue())
            Toast.makeText(MainActivity.this, "Ваш ответ меньше", Toast.LENGTH_SHORT).show();
        else if(resp == num2.intValue())
        {
            Toast.makeText(MainActivity.this, "Ответ верный!", Toast.LENGTH_SHORT).show();
            n1 = true;
        }

        if(n1)
        {
            Toast.makeText(MainActivity.this, "Задано новое число!", Toast.LENGTH_SHORT).show();
            num = Math.random() * 100;
            num2 = Math.round(num);
            num1 = Long.toString(num2);
        }

    }

}