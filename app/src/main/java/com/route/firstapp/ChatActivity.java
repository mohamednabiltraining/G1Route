package com.route.firstapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 12/28/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class ChatActivity extends AppCompatActivity {


    ImageView image1;
    ImageView image2;
    TextView message1;
    TextView message2;
    EditText message;
    ImageView send;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_practice);

        image1 =  findViewById(R.id.img1);
        image2 = findViewById(R.id.img2);
        message1 = findViewById(R.id.mssg1);
        message2 = findViewById(R.id.mssg2);
        message = findViewById(R.id.message);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///action
                String m = message.getText().toString();
                message1.setText(m);
                Log.e("meesage",m);
                message.setText("");
            }
        });
    }
}
