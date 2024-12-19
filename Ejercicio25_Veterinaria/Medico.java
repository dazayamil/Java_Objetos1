package Ejercicio25_Veterinaria;

import java.time.LocalDate;
import java.time.Period;

public class Medico {
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorarios;

    public Medico(String nombre, double honorarios){
        this.nombre = nombre;
        this.fechaIngreso = LocalDate.now();
        this.honorarios = honorarios;
    }

    public double antiguedad(){
        int aniosAntiguedad = Period.between(this.fechaIngreso, LocalDate.now()).getYears();
        return 100 * aniosAntiguedad;
    }

    public double getHonorarios() {
        return this.honorarios;
    }
}
