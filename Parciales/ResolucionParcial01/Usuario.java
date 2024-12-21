package Parciales.ResolucionParcial01;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private List<Entrada> entradas;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.entradas = new ArrayList<>();
    }
}
