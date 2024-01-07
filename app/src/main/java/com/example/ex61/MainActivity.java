package com.example.ex61;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button btn;

    ImageView iv;

    int rndNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.iv);


    }



    public void clicked(View view) {
        Random rnd = new Random();
        rndNumber= rnd.nextInt(3)+1;
        btn.setText(String.valueOf(rndNumber));
        if (rndNumber==1){
            iv.setImageResource(R.drawable.gossip_girl);
        }
        if (rndNumber==2){
            iv.setImageResource(R.drawable.lucifer);
        }
        if (rndNumber==3){
            iv.setImageResource(R.drawable.galis);
        }
    }
}
