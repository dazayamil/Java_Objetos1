package Ejercicio25_Veterinaria;

import java.time.LocalDate;

public class Medico {
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorarios;

    public Medico(String nombre, double honorarios){
        this.nombre = nombre;
        this.fechaIngreso = LocalDate.now();
        this.honorarios = honorarios;
    }
}
