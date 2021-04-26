   package com.example.eva1_4_findview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

   public class MainActivity extends AppCompatActivity {

    TextView txtVwMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se conecta la variable con el widget
        txtVwMensaje = findViewById(R.id.txtVwMensaje);

        /*
        Widget   -->   Nombre (cadena de texto)
        findViewById(numero entero)
        Archivo de indices   = R.java
        Nombre del widget (texto)  -->  se le asigna un número
         */
        txtVwMensaje.setText("Hola Mundo Cruel");
    }
}