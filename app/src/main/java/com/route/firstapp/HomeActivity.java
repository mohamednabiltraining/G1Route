package com.route.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button openChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.e("home","created");

        openChat=findViewById(R.id.chat);
        openChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ChatActivity.class);
                startActivity(intent);
            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("home","started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("home","Resumed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("home","Paused");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("home","stopped");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("home","Destroyed");

    }

    public void onCalculatorClicked(View view){
        Intent intent = new Intent(HomeActivity.this,Calculator.class);
        startActivity(intent);
    }


    public void exit(View view) {
        finish();
    }

    public void openRecyclerView(View view) {
        Intent intent = new Intent(HomeActivity.this,WhatsAppContactsList.class);
        startActivity(intent);
    }
}
