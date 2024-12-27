package Ejercicio19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    private List<ServicioDeEnvio> serviciosPedidos;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.serviciosPedidos = new ArrayList();
    }

    public void agregarEnvio(ServicioDeEnvio envio) {
        this.serviciosPedidos.add(envio);
    }

    public int getCantidadServiciosPedidos() {
        return this.serviciosPedidos.size();
    }

    public double montoAPagarPorEnvios(LocalDate fechaInicio, LocalDate fechaFin) {
        double total = this.serviciosPedidos.stream().filter((envio) -> {
            return envio.estaDentroDelPeriodo(fechaInicio, fechaFin);
        }).mapToDouble((envio) -> {
            return envio.costoDeEnvio();
        }).sum();
        return total;
    }
}
