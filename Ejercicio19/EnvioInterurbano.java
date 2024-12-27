package Ejercicio19;

import java.time.LocalDate;

public class EnvioInterurbano extends ServicioDeEnvio{
    private double distanciaKm;

    public EnvioInterurbano(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double peso, double distanciaKm) {
        super(fechaDespacho, direccionOrigen, direccionDestino, peso);
        this.distanciaKm = distanciaKm;
    }

    public double costoDeEnvio() {
        double peso = this.getPeso();
        if (this.distanciaKm < 100.0) {
            return peso * 20.0;
        } else {
            return this.distanciaKm >= 100.0 && this.distanciaKm <= 500.0 ? peso * 25.0 : peso * 30.0;
        }
    }
}
