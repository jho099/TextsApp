package com.hojennifer.texts02;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button nameButton;
    EditText responseText;
    TextView displayText;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameButton = findViewById(R.id.nameButton);
        responseText = findViewById(R.id.editText1);
        displayText = findViewById(R.id.textView1);
    }


    public void showName(View view) {
        displayText.setText(responseText.getText().toString() + ", here are some sneks \n");
    }

    public void colorChange(View view) {

        Resources res = getResources();
        String[] snakes = res.getStringArray(R.array.snakes_array);
        if(index >= snakes.length) {
            index = 0;
            displayText.setText(responseText.getText().toString() + ", here are some sneks \n");
        }
        String snakeStr = snakes[index];
        displayText.setText(displayText.getText() + " " + snakeStr);
        index++;

    }
}
