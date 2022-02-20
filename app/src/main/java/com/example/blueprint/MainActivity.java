package com.example.blueprint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static double[][] layout = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //double[][] layout1 = {{28.0, 6.0, 40.0, 34.0}, {6.0, 32.0, 34.0, 28.0},
        //        {40.0, 34.0, 24.0, 16.0}, {34.0, 28.0, 16.0, 12.0}};

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("StoreLayouts");

        /*try {
            ref.child("layout1").setValue(ObjectSerializer.serialize(layout1));
        } catch (IOException e){
            e.printStackTrace();
        }*/

        ref.child("layout1").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if(snapshot.exists() && snapshot.getValue() != null){
                    layout = (double[][]) ObjectSerializer.deserialize(snapshot.getValue().toString());
                    assert layout != null;
                    printArr(layout);
                }
            }
            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {
                System.out.println("DATABASE ERROR: " + error.getMessage());
            }
        });


        TextView grocifyTitle = findViewById(R.id.textView6);
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

    private void printArr(double[][] arr) {
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(i == 0 ? "[" : "  [");
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + (j == arr[i].length - 1 ? "" : ", "));
            }
            System.out.print("]" + (i < arr.length - 1 ? "," : ""));

            if(i < arr.length - 1){
                System.out.println();
            }
        }
        System.out.print(" ]");
        System.out.println();
    }
}


