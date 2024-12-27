package Ejercicio19;

import java.time.LocalDate;

public class PersonaFisica extends Cliente{
    private String dni;
    private final double DESCUENTO_10_PORCIENTO = 0.9;

    public PersonaFisica(String nombre, String apellido, String dni) {
        super(nombre, apellido);
        this.dni = dni;
    }

    public double aplicarDescuento(double total) {
        return 1.0;
    }

    public double montoAPagarPorEnvios(LocalDate fechaInicio, LocalDate fechaFin) {
        double total = super.montoAPagarPorEnvios(fechaInicio, fechaFin);
        return total * 0.9;
    }
}
