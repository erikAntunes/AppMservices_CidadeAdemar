package com.titanz.mservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.titanz.mservices.adapters.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private int[] paginas = {R.drawable.m_services_cidadeademar_2_splash_2,R.drawable.m_services_cidadeademar_3,R.drawable.m_services_cidadeademar_4,
            R.drawable.m_services_cidadeademar_5,R.drawable.m_services_cidadeademar_6,R.drawable.m_services_cidadeademar_7,
            R.drawable.m_services_cidadeademar_8,R.drawable.m_services_cidadeademar_9,R.drawable.m_services_cidadeademar_10,
            R.drawable.m_services_cidadeademar_11,R.drawable.m_services_cidadeademar_12,R.drawable.m_services_cidadeademar_13,
            R.drawable.m_services_cidadeademar_14,R.drawable.m_services_cidadeademar_15,R.drawable.m_services_cidadeademar_16};

    private RecyclerAdapter adapter;


    private RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(paginas);
        recyclerView.setAdapter(adapter);

    }
}
