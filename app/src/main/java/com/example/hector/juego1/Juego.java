package com.example.hector.juego1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Juego extends AppCompatActivity implements View.OnClickListener {
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        img1 = (ImageView)findViewById(R.id.imgB);
        img1.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        if(v== img1){
            // hacer lo que sea
            finish();

        }
    }
}
