package com.example.universitasdiindonesia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUniv;
    private ArrayList<Universitas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUniv = findViewById(R.id.rv_univ);
        rvUniv.setHasFixedSize(true);

        list.addAll(UnivData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvUniv.setLayoutManager(new LinearLayoutManager(this));
        ListUnivAdapter listHeroAdapter = new ListUnivAdapter(list);
        rvUniv.setAdapter(listHeroAdapter);
    }
}
