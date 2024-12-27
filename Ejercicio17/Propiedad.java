package Ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String direccion;
    private String nombreDescriptivo;
    private double precioPorNoche;
    private List<Reserva> reservasPropiedad;

    public Propiedad() {
    }

    public Propiedad(String direccion, String nombreDescriptivo, double precioPorNoche) {
        this.direccion = direccion;
        this.nombreDescriptivo = nombreDescriptivo;
        this.precioPorNoche = precioPorNoche;
        this.reservasPropiedad = new ArrayList();
    }

    public double getPrecioPorNoche() {
        return this.precioPorNoche;
    }

    public void agregarReservaPropiedad(Reserva reserva) {
        this.reservasPropiedad.add(reserva);
    }

    public boolean esDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        return this.reservasPropiedad.stream().noneMatch((reserva) -> {
            return reserva.estaOcupado(fechaInicio, fechaFin);
        });
    }

    public double gananciaAlquiler(LocalDate fechaInicio, LocalDate fechaFin) {
        return this.reservasPropiedad.stream().filter((reserva) -> {
            return reserva.estaEnElPeriodo(fechaInicio, fechaFin);
        }).mapToDouble((reserva) -> {
            return reserva.costoReserva();
        }).sum();
    }
}
