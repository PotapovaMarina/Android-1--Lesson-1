package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText1;
    private EditText editText2;
    private TextView resultText1;
    private TextView resultText2;
    private TextView textMsg;
    private ImageButton button2;

    private double arg1;
    private double arg2;
    private double argResult1;
    private double argResult2;
    final int constKm = 1000000;
    final int constSm = 10000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.image_button);
        editText1 = findViewById(R.id.edit_text1);
        editText2 = findViewById(R.id.edit_text2);
        resultText1 = findViewById(R.id.result_text1);
        resultText2 = findViewById(R.id.result_text2);
        textMsg = findViewById(R.id.text_msg);


        button.setOnClickListener(view -> {
            try {
                arg1 = Double.valueOf(editText1.getText().toString());
                arg2 = Double.valueOf(editText2.getText().toString());
                argResult1 = arg1 * constKm;
                argResult2 = arg2 / constSm;

                resultText1.setText(String.valueOf(argResult1));
                resultText2.setText(String.valueOf(argResult2));
                textMsg.setText("");

            } catch (NumberFormatException e) {
                textMsg.setText("Введите число!");
            }
        });
        button2.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
    }
}