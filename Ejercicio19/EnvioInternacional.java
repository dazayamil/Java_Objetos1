package Ejercicio19;

import java.time.LocalDate;

public class EnvioInternacional extends ServicioDeEnvio{
    public EnvioInternacional(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double peso) {
        super(fechaDespacho, direccionOrigen, direccionDestino, peso);
    }

    public double costoDeEnvio() {
        double peso = this.getPeso();
        return peso > 1000.0 ? 12.0 * peso + 5000.0 : 10.0 * peso + 5000.0;
    }
}
