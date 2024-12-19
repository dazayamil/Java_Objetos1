package Ejercicio25_Veterinaria;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String especie;
    private List<Servicio> servicios;

    public Mascota(String nombre, String especie){
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.now();
        this.especie = especie;
        this.servicios = new ArrayList<>();
    }
}
