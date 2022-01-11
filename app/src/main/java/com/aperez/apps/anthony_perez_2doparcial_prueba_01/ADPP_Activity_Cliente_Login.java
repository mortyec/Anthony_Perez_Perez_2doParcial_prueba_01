package com.aperez.apps.anthony_perez_2doparcial_prueba_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ADPP_Activity_Cliente_Login extends AppCompatActivity {

    private EditText editTextCodigo;
    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextUsuario;
    private EditText editTextContraseña;

    private EditText editTextLoginUsuario;
    private EditText editTextLoginContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adpp_cliente_login);

        editTextCodigo = findViewById(R.id.editTextCodigo);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextContraseña = findViewById(R.id.editTextContraseña);

        editTextLoginUsuario = findViewById(R.id.editTextContraseña);
    }
}