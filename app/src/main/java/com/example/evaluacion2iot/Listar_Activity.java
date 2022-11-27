package com.example.evaluacion2iot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class Listar_Activity extends AppCompatActivity {

    private TextInputLayout tilFiltrar;
    private Button btnBuscar;
    private ListView lstDatos;

    private ArrayList<Tareas> lastareas;


    private ArrayAdapter<Tareas> adapterTareas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar2);

        poblarArregloArrayList();
        referencias();
        eventos();

        }
    private void eventos(){
        lstDatos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Listar_Activity.this, "Desea eliminar a " + lastareas.get(position).getTareas(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

    private void referencias(){
        tilFiltrar = findViewById(R.id.tilFiltrar);
        btnBuscar = findViewById(R.id.btnBuscar);
        lstDatos = findViewById(R.id.lstDatos);

        adapterTareas = new ArrayAdapter<Tareas>(this, android.R.layout.simple_list_item_1, lastareas);
        lstDatos.setAdapter(adapterTareas);
    }

    private void poblarArregloArrayList(){
        lastareas = new ArrayList<Tareas>();

        for (int x = 0; x <=5; ++x){
            Tareas c = new Tareas();
            c.setTareas("correr");
            c.setDescripcion("salir a correr");
            lastareas.add(c);
        }






        }
    }






