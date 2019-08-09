package com.nicolasfanin.IUASampleApp.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.nicolasfanin.IUASampleApp.data.Color;
import com.nicolasfanin.IUASampleApp.utils.ListAdapter;
import com.nicolasfanin.IUASampleApp.R;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ArrayList<Color> colors;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initColors();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(colors));
    }

    @SuppressLint("ResourceType")
    private void initColors() {
        colors = new ArrayList<>();

        colors.add(new Color(getString(R.string.blue), getResources().getString(R.color.blue)));
        colors.add(new Color(getString(R.string.indigo), getResources().getString(R.color.indigo)));
        colors.add(new Color(getString(R.string.red), getResources().getString(R.color.red)));
        colors.add(new Color(getString(R.string.green), getResources().getString(R.color.green)));
        colors.add(new Color(getString(R.string.orange), getResources().getString(R.color.orange)));
        colors.add(new Color(getString(R.string.grey), getResources().getString(R.color.bluegrey)));
        colors.add(new Color(getString(R.string.amber), getResources().getString(R.color.teal)));
        colors.add(new Color(getString(R.string.deeppurple), getResources().getString(R.color.deeppurple)));
        colors.add(new Color(getString(R.string.bluegrey), getResources().getString(R.color.bluegrey)));
        colors.add(new Color(getString(R.string.yellow), getResources().getString(R.color.yellow)));
        colors.add(new Color(getString(R.string.cyan), getResources().getString(R.color.cyan)));
        colors.add(new Color(getString(R.string.brown), getResources().getString(R.color.brown)));
        colors.add(new Color(getString(R.string.teal), getResources().getString(R.color.teal)));

    }

}