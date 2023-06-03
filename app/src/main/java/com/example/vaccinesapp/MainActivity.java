package com.example.vaccinesapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    RecyclerView recyclerView;

    VaccineModel[] vaccineList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        vaccineList = new VaccineModel[]{
                new VaccineModel("Hepatits B", R.drawable.vaccine1),
                new VaccineModel("Tetanus", R.drawable.vaccine4),
                new VaccineModel("Pneumococcal Vaccine", R.drawable.vaccine5),
                new VaccineModel("Rotavirus Vaccine", R.drawable.vaccine6),
                new VaccineModel("Measles Virus", R.drawable.vaccine7),
                new VaccineModel("Cholera Virus", R.drawable.vaccine8),
                new VaccineModel("Covid-19 Virus", R.drawable.vaccine7),
        };

        MyAdapter adapter = new MyAdapter(vaccineList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(this, "Vaccine name: " + vaccineList[pos].getTitle(), Toast.LENGTH_SHORT).show();
    }
}