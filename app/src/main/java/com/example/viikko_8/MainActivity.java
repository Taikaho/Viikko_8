package com.example.viikko_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numInput1;
    private EditText numInput2;
    private TextView numOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numInput1 = findViewById(R.id.inputText1);
        numInput2 = findViewById(R.id.inputText2);
        numOutput = findViewById(R.id.outputText);
    }

    public void increase(View view) {
        String luku1String = numInput1.getText().toString();
        String luku2String = numInput2.getText().toString();

        int luku1 = Integer.parseInt(luku1String);
        int luku2 = Integer.parseInt(luku2String);

        int summa = luku1 + luku2;

        numOutput.setText(String.valueOf("Tulos: " + summa));
    }

    public void decrease(View view) {
        String luku1String = numInput1.getText().toString();
        String luku2String = numInput2.getText().toString();

        int luku1 = Integer.parseInt(luku1String);
        int luku2 = Integer.parseInt(luku2String);

        int summa = luku1 - luku2;

        numOutput.setText(String.valueOf("Tulos: " + summa));
    }

    public void multiply(View view) {
        String luku1String = numInput1.getText().toString();
        String luku2String = numInput2.getText().toString();

        int luku1 = Integer.parseInt(luku1String);
        int luku2 = Integer.parseInt(luku2String);

        int summa = luku1 * luku2;

        numOutput.setText(String.valueOf("Tulos: " + summa));
    }

    public void divine(View view) {
        String luku1String = numInput1.getText().toString();
        String luku2String = numInput2.getText().toString();

        int luku1 = Integer.parseInt(luku1String);
        int luku2 = Integer.parseInt(luku2String);

        int summa = luku1 / luku2;

        numOutput.setText(String.valueOf("Tulos: " + summa));
    }

}