package com.route.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.route.firstapp.Adapters.WhatsAppConstactsRecyclerAdapter;
import com.route.firstapp.Model.WhatsAppContact;

import java.util.ArrayList;
import java.util.List;

public class WhatsAppContactsList extends AppCompatActivity implements View.OnClickListener {

    RecyclerView whatsAppRecyclerView;
    WhatsAppConstactsRecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    List<WhatsAppContact> data;
    ImageView HList,VList,Grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app_contacts_list);
        CreateContactsList();
        whatsAppRecyclerView = findViewById(R.id.contacts_recycler_view);
        layoutManager = new LinearLayoutManager(WhatsAppContactsList.this);
        adapter = new WhatsAppConstactsRecyclerAdapter(data);
        whatsAppRecyclerView.setAdapter(adapter);
        whatsAppRecyclerView.setLayoutManager(layoutManager);
        VList = findViewById(R.id.v_list);
        HList = findViewById(R.id.h_list);
        Grid = findViewById(R.id.grid);
        VList.setOnClickListener(this);
        HList.setOnClickListener(this);
        Grid.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.grid){
             layoutManager = new GridLayoutManager(this,2);
        }else if(v.getId()==R.id.h_list){
            layoutManager =
                    new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        }else if(v.getId()==R.id.v_list){
            layoutManager = new LinearLayoutManager(this);
        }
        whatsAppRecyclerView.setLayoutManager(layoutManager);

    }

    public void CreateContactsList(){
        data = new ArrayList<>();
        for(int i=0;i<50;i++){
            data.add(new WhatsAppContact("contact number "+i,"available",R.drawable.chat_person));
        }

    }
}