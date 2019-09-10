package com.example.universitasdiindonesia;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onComposeAction(MenuItem mi) {
        // pengecekannya di sini
    }
}
