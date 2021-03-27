package com.example.eva_1_primer_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Ciclo de vida de la App - Evento Main
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Se encarga de mostrar la pantalla de la app
    }
}