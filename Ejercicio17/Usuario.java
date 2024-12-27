package Ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nombre;
    private String direccion;
    private String dni;
    private List<Propiedad> propiedades;
    private List<Reserva> reservas;

    public Usuario() {
    }

    public Usuario(String nombre, String direccion, String dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.propiedades = new ArrayList();
        this.reservas = new ArrayList();
    }

    public void agregarPropiedad(Propiedad p) {
        this.propiedades.add(p);
    }

    public boolean crearReserva(Propiedad propiedad, LocalDate fechaInicio, LocalDate fechaFin) {
        if (propiedad.esDisponible(fechaInicio, fechaFin)) {
            Reserva reserva = new Reserva(fechaInicio, fechaFin, propiedad);
            this.reservas.add(reserva);
            propiedad.agregarReservaPropiedad(reserva);
            return true;
        } else {
            return false;
        }
    }

    public double calcularPrecioDeReserva(Reserva reserva) {
        return this.reservas.contains(reserva) ? reserva.costoReserva() : 0.0;
    }

    public boolean cancelarReserva(Reserva reserva) {
        if (!reserva.estaEnCurso()) {
            this.reservas.remove(reserva);
            return true;
        } else {
            return false;
        }
    }

    public boolean consultarDisponibilidadPropiedad(Propiedad propiedad, LocalDate fechaInicio, LocalDate fechaFin) {
        return propiedad.esDisponible(fechaInicio, fechaFin);
    }

    public double calcularIngresarPropietario(LocalDate fechaInicio, LocalDate fechaFin) {
        double total = this.propiedades.stream().mapToDouble((propiedad) -> {
            return propiedad.gananciaAlquiler(fechaInicio, fechaFin);
        }).sum();
        return 0.0;
    }
}
