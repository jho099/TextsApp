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
    TextView displayText2;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameButton = findViewById(R.id.nameButton);
        responseText = findViewById(R.id.editText1);
        displayText = findViewById(R.id.textView1);
        displayText2 = findViewById(R.id.textView2);
    }


    public void showName(View view) {
        displayText.setText(responseText.getText().toString() + ", here are some sneks \n");
    }

    public void changeSnake(View view) {

        Resources res = getResources();
        String[] snakes = res.getStringArray(R.array.snakes_array);
        String name = responseText.getText().toString();
        if(index >= snakes.length || index == 0) { //at the end of the array or very beginning
            index = 0;
            String oneSnake = getString(R.string.one_snake, name);
            displayText.setText(oneSnake);
            displayText2.setText("");
        }
        else{ //anywhere in between
            String moreSnakes = getString(R.string.more_snakes, name, index+1);
            displayText.setText(moreSnakes);
        }
        //regardless of index, DO THIS DOWN BELOW
        String snakeStr = snakes[index];
        displayText2.setText(displayText2.getText() + " " + snakeStr);
        index++;

    }
}
