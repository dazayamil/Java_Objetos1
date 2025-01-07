package GestionTurnosBarberia;

import java.time.LocalDate;

public class Turno {
    private LocalDate fecha;
    private String hora;
    private String estado;
    private TipoServicio tipoServicio;
    private Barbero barbero;
    private Cliente cliente;

    public Turno(LocalDate fecha, String hora, TipoServicio tipoServicio, Barbero barbero, Cliente cliente){
        this.fecha = fecha;
        this.hora = hora;
        this.estado = "Pendiente";
        this.tipoServicio = tipoServicio;
        this.barbero = barbero;
        this.cliente = cliente;

    }
}
