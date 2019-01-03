package com.route.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {



    Button login;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        login = findViewById(R.id.login);
        username = findViewById(R.id.user_name);
        password = findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNameString = username.getText().toString();
                String passwordString = password.getText().toString();
                if(userNameString.equals("android")&&passwordString.equals("android")){
                    Intent intent = new Intent(SplashActivity.this,ChatActivity.class);
                    startActivity(intent);
                }else {
                    username.setError("invalid credientals");
                    Toast.makeText(SplashActivity.this,"wrong user name or password",Toast.LENGTH_LONG)
                            .show();

                    //Toast.makeText(SplashActivity.this, "", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
