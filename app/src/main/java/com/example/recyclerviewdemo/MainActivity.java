package com.example.recyclerviewdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    ArrayList<FlowerModel> flowers;
    ArrayList<PersonProfileModel> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        // array list of data to be show
        flowers = new ArrayList<>();
        flowers.add(new FlowerModel("Lotus"));
        flowers.add(new FlowerModel("rose"));
        flowers.add(new FlowerModel("lily"));
        flowers.add(new FlowerModel("poppy"));
        flowers.add(new FlowerModel("sunflower"));
        flowers.add(new FlowerModel("lavender"));
        flowers.add(new FlowerModel("tulip"));
        flowers.add(new FlowerModel("daisy"));

        // finding view by id
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // setting layout manager linear, grid, staggered, etc.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FlowerAdapter adapter = new FlowerAdapter(flowers);
        recyclerView.setAdapter(adapter);
*/
        persons = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setBackgroundColor(Color.BLACK);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "abc", "123123123"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "xyz", "12334556j"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "qwe", "45-9034"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "fjls", "405870234"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "sjldf", "123123123"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "jtoj", "123123123"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "abc", "2348920394"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "dsf", "123123123"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "abc", "123123123"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "abc", "123123123"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "fsdjfl", "123123123"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "fjrtui", "238402"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "fjlsdkf", "43827304"));
        persons.add(new PersonProfileModel(R.drawable.person_profile, "abc", "74283492340"));

        PersonProfileAdapter adapter = new PersonProfileAdapter(persons);
        recyclerView.setAdapter(adapter);



    }
}