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

    public ConsultaMedica darAltaConsultaMedica(Medico medico){
        ConsultaMedica consultaMedica = new ConsultaMedica(this, medico);
        this.servicios.add(consultaMedica);
        return consultaMedica;
    }
    public Vacunacion darAltaVacunacion(Medico medico, String nombreVacunacion, double costoVacunacion){
        Vacunacion vacunacion = new Vacunacion(this, medico, nombreVacunacion, costoVacunacion);
        this.servicios.add(vacunacion);
        return vacunacion;
    }
    public Guarderia darAltaGuarderia(int cantidadDias){
        Guarderia guarderia = new Guarderia(this, cantidadDias);
        this.servicios.add(guarderia);
        return guarderia;
    }

    public int getCantidadServicio(){
        return this.servicios.size();
    }
}
