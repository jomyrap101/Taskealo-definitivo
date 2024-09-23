package com.example.taskealo_definitivo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button crearNota;
    private Button secretos;
    private Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crearNota = (Button) findViewById(R.id.btnCrearNota);

        crearNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagNota = new Intent(MainActivity.this, Crear_Nota.class);
                startActivity(pagNota);
            }
        });

        secretos = (Button) findViewById(R.id.btnSecreto);

        secretos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagSecreto = new Intent(MainActivity.this, Secretos.class);
                startActivity(pagSecreto);
            }
        });

        salir = (Button) findViewById(R.id.btn_exit);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });

    }
}