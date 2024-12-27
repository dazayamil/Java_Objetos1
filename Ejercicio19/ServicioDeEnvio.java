package Ejercicio19;

import java.time.LocalDate;

public abstract class ServicioDeEnvio {
    private LocalDate fechaDespacho;
    private String direccionOrigen;
    private String direccionDestino;
    private double peso;

    public ServicioDeEnvio(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double peso) {
        this.fechaDespacho = fechaDespacho;
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public boolean estaDentroDelPeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
        return this.fechaDespacho.isBefore(fechaFin) && this.fechaDespacho.isAfter(fechaInicio);
    }

    public abstract double costoDeEnvio();
}
