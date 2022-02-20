package com.example.blueprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button backButton2 = findViewById(R.id.backButton2);

        backButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                clicks[0]++;
//                myText1.setText("I have clicked on the button " + clicks[0] + " times!");

                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}