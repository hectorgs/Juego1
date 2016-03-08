package com.example.hector.juego1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btComenzar;
    Button btSalir;
    Button btPuntuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btComenzar = (Button)findViewById(R.id.btComenzar);
        btSalir = (Button)findViewById(R.id.btSalir);
        btPuntuar = (Button)findViewById(R.id.btPuntuaciones);

        btComenzar.setOnClickListener(this);
        btPuntuar.setOnClickListener(this);
        btSalir.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v==btComenzar){
            //Intent i = new Intent(this,JuegoActivity.class);
            Intent intent;
            intent = new Intent(this, Juego.class);
            startActivity(intent);
        }else if(v==btPuntuar){

        }else if(v==btSalir){
            finish();
        }
    }
}
