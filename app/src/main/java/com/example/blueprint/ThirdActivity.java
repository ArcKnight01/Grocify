package com.example.blueprint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

//        // declaring a RecyclerView and initializing its Adapter and LayoutManager
//        RecyclerView foodList = findViewById(R.id.foodList);
//        FoodListAdapter adapter = new FoodListAdapter(this);
//        foodList.setLayoutManager(new LinearLayoutManager(this));
//        foodList.setAdapter(adapter);

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