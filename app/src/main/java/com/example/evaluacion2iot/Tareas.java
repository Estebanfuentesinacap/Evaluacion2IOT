package com.example.evaluacion2iot;

import java.io.Serializable;

public class Tareas  implements Serializable {
    private String tareas;
    private String descripcion;

    @Override
    public String toString() {
        return "Tareas{" +
                "tareas='" + tareas + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public Tareas(){}

    public Tareas(String tareas, String descripcion){

        setTareas(tareas);
        setDescripcion(descripcion);
        getTareas();
        getDescripcion();

    }

    // region get y set

    public String getTareas() { return tareas; }
    public void setTareas(String nuevaTarea) { tareas = nuevaTarea.toUpperCase(); }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String nuevaDescripcion) { descripcion = nuevaDescripcion.toUpperCase(); }

    //endregion
}
