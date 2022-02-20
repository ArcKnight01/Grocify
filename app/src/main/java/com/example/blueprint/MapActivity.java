package com.example.blueprint;

import static com.example.blueprint.SecondActivity.shoppingList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class MapActivity extends AppCompatActivity {
    ArrayList<String> mapList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        TextView textView = findViewById(R.id.textView2);


        mapList = shoppingList;

        StringBuilder str = new StringBuilder();

        for (String item : mapList){
            str.append(item + ", \n");
        }
        textView.setText(str);

        Button backButton3 = findViewById(R.id.backButton3);

        backButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                clicks[0]++;
//                myText1.setText("I have clicked on the button " + clicks[0] + " times!");

                Intent intent = new Intent(MapActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
