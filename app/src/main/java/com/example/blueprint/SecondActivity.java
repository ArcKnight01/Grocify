package com.example.blueprint;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

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

        String foodList[] = {
                "bannanas",
                "apples",
                "oranges",
                "milk",
                "peaches",
                "eggplant",
                "lemons",
                "eggs",
                "tomatoes"
        };
        TextView displayText = findViewById(R.id.itemDisplay);
        EditText editText = findViewById(R.id.search);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                displayText.setText("");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String input = editText.getText().toString();
                for (String item : foodList){
                    if (input.equals(item)){
                        displayText.setText(input);
                        break;
                    }
                }

//                myText1.setText("Hello, " + name + "!");
            }
        });
//        WebView myWebView = (WebView) findViewById(R.id.webView);
//        myWebView.loadUrl("https://www.google.com");
    }
}