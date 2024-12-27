package Ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InversionEnPlazoFijo implements Inversion{
    private LocalDate fechaConstitucion;
    private double montoDepositado;
    private double porcentajeDeInteresDiario;

    public InversionEnPlazoFijo() {
    }

    public InversionEnPlazoFijo(double montoDepositado, double porcentajeDeInteresDiario) {
        this.fechaConstitucion = LocalDate.now();
        this.montoDepositado = montoDepositado;
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }

    public double valorActual() {
        double factor = 1.0 + this.porcentajeDeInteresDiario / 100.0;
        double tiempo = (double) ChronoUnit.DAYS.between(this.fechaConstitucion, LocalDate.now());
        return this.montoDepositado * Math.pow(factor, tiempo);
    }
}
