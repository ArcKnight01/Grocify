package com.example.blueprint;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//
//        // declaring a RecyclerView and initializing its Adapter and LayoutManager
//        RecyclerView foodList = findViewById(R.id.foodList);
//        FoodListAdapter adapter = new FoodListAdapter(this);
//        foodList.setLayoutManager(new LinearLayoutManager(this));
//        foodList.setAdapter(adapter);

        RecyclerView foodList = findViewById(R.id.foodList);
        FoodListAdapter adapter = new FoodListAdapter(this);


        Button backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                clicks[0]++;
//                myText1.setText("I have clicked on the button " + clicks[0] + " times!");

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                clicks[0]++;
//                myText1.setText("I have clicked on the button " + clicks[0] + " times!");

                Intent intent = new Intent(SecondActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        //number of items
        //which category the items are in...

        //this is where the database is imported into this aList (replace the string values)

        String aList[] = {
                "bananas",
                "apples",
                "oranges",
                "milk",
                "peaches",
                "eggplant",
                "lemons",
                "eggs",
                "tomatoes"
        };
        List<String> itemList = new ArrayList<String>(
                Arrays.asList(aList)
        );


        ArrayList<String> shoppingList = new ArrayList<>();

        ImageButton searchButton = findViewById(R.id.searchButton);


        TextView displayText = findViewById(R.id.itemDisplay);
        EditText editText = findViewById(R.id.search);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                searchButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        String input = editText.getText().toString().toLowerCase();

                        if(itemList.contains(input.toLowerCase())){
//                            displayText.setText(input);
                            shoppingList.add(input);
                        }else{
                            displayText.setText("Sorry, the item you are looking for does not exist at this moment. We apologize for the hassle.");
                        }
                    }
                });

                StringBuilder str = new StringBuilder();
                for (String item : shoppingList){
                    str.append(item + ", ");
                }
                displayText.setText(str);

                int length = shoppingList.size();
//                myText1.setText("Hello, " + name + "!");
            }
        });
//        WebView myWebView = (WebView) findViewById(R.id.webView);
//        myWebView.loadUrl("https://www.google.com");
    }
}