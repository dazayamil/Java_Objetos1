package Ejercicio19;

import java.time.LocalDate;

public class EnvioLocal extends ServicioDeEnvio{
    private boolean entregaRapida = false;

    public EnvioLocal(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double peso) {
        super(fechaDespacho, direccionOrigen, direccionDestino, peso);
    }

    public void setEntregaRapida(boolean entregaRapida) {
        this.entregaRapida = entregaRapida;
    }

    public double costoDeEnvio() {
        return this.entregaRapida ? 1500.0 : 1000.0;
    }
}
