package com.shajidurrahmansaad.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ArrayMain> name = new ArrayList<>();

        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));
        name.add(new ArrayMain("Shajidur", "Rahman", "12"));

        MyArrayAdapter myArrayAdapter = new MyArrayAdapter(this, name);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(myArrayAdapter);

    }
}