package com.example.blueprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView grocifyTitle = findViewById(R.id.grocifyTitle);
        final int[] clicks = {0};
        Button shopButton = findViewById(R.id.shopButton);
        Button aboutButton = findViewById(R.id.aboutButton);

        shopButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clicks[0]++;
//                myText1.setText("I have clicked on the button " + clicks[0] + " times!");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clicks[0]++;
//                myText1.setText("I have clicked on the button " + clicks[0] + " times!");

                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });


        //        TextView myText1 = findViewById(R.id.myText1);
//        TextView myText2 = findViewById(R.id.myText2);
//        Switch switch1 = findViewById(R.id.switch1);
//
//        ImageView imageView1 = findViewById(R.id.imageView1);
//        Gson gson = new Gson();
//        try {
//            InputStreamReader reader = new InputStreamReader(getAssets().open("Datapack/data/0001.json"));
//            JsonObject data = gson.fromJson(reader, JsonObject.class);
//            reader.close();
//
//            String name = data.get("Name").getAsString();
//            String year = data.get("Year").getAsString();
//
//
//
//            myText1.setText(name + " " + year);
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//
//        Picasso.get().load("file:///android_asset/Datapack/images/0001/jpg").fit().into(imageView1);
//
//        final int[] clicks = {0};
//        Button button = findViewById(R.id.button2);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                clicks[0]++;
//                myText1.setText("I have clicked on the button " + clicks[0] + " times!");
//
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        myText1.setText("");
//        myText2.setText("This is an image of a strawberry!");
//
//        switch1.setChecked(false);
//
//        switch1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                if (switch1.isChecked()) {
//                    myText2.setText("The switch is on!");
//                }
//                else {
//                    myText2.setText("The switch is off!");
//                }
//            }
//        });
//
//        for (int i = 0; i < 20; i++){
//            myText1.setTextSize(i);
//        }
//
//        EditText editText = findViewById(R.id.editText);
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                String name = editText.getText().toString();
//                myText1.setText("Hello, " + name + "!");
//            }
//        });
    }
}


