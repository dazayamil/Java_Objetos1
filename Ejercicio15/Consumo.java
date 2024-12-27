package Ejercicio15;

import java.time.LocalDate;

public class Consumo {
    private LocalDate fecha = LocalDate.now();
    private double consumoEnergiaActiva;
    private boolean consumoEnergiaReactiva;
    private double bonificacion;

    public Consumo(double consumoEnergiaActiva) {
        this.consumoEnergiaActiva = consumoEnergiaActiva;
        this.consumoEnergiaReactiva = false;
        this.bonificacion = 0.0;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }
}
