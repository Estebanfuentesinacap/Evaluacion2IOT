package com.example.evaluacion2iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilFiltrar, tilTarea;
    private TextInputEditText edtinterior;
    private EditText edtDescripcion;
    private Button bntIngresar, btnModificar, btnFiltrar;
    private ArrayList<String> Tareas = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referenciasWidget();
        eventos();


    }

    private void referenciasWidget(){
        edtDescripcion= findViewById(R.id.edtDescripcion);
        edtinterior = findViewById(R.id.edtinterior);
        tilTarea = findViewById(R.id.tilTarea);
        btnFiltrar = findViewById(R.id.btnFiltrar);
        bntIngresar = findViewById(R.id.btnIngresar);
        btnModificar = findViewById(R.id.btnModificar);

    }


    private void eventos(){
        bntIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tarea, descripcion, dato;
                tarea = tilTarea.getEditText().getText().toString();
                descripcion = edtDescripcion.getText().toString();
                dato = tilTarea.getEditText().getText().toString();


                if (tarea.isEmpty() && descripcion.isEmpty()) {
                    edtDescripcion.setError("Debe ingresar Descripcion");
                    edtinterior.setError("debe ingresar Tarea");
                } else {
                    if (tarea.isEmpty()) {
                        edtinterior.setError("Debe ingresar Tarea");
                    } else {
                        if (descripcion.isEmpty()) {
                            edtDescripcion.setError("Debe ingresar una Descripcion");
                        } else {
                            String tareas, descri;


                            tareas = tilTarea.getEditText().getText().toString();
                            descri = edtDescripcion.getText().toString();
                            Tareas tar = new Tareas(tareas, descripcion);
                            Intent mostrarInfo = new Intent(MainActivity.this, Listar_Activity.class);
                            mostrarInfo.putExtra("tareas", Tareas);
                            startActivity(mostrarInfo);

                        }
                    }
                }
            }
        });

        btnFiltrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Listar_Activity.class);
                startActivity(intent);
            }
        });
    }

    }