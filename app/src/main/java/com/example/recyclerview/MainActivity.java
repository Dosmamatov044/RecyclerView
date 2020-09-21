package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Adapter.AdapterMain;

public class MainActivity extends AppCompatActivity {

    AdapterMain adapterMain;
    RecyclerView recyclerView;
    List <String> arrayList=new ArrayList<>();


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

recyclerView=findViewById(R.id.recyclerView);
        adapterMain =new AdapterMain();
        recyclerView.setAdapter(adapterMain);




    }
}