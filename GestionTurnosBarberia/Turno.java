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

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void cambiarFechaYHora(LocalDate fechaNueva, String horaNueva){
        this.fecha = fechaNueva;
        this.hora = horaNueva;
    }

    public boolean estaLibre(LocalDate fechaNueva, String horaNueva){
        return (this.fecha.equals(fechaNueva) && this.hora.equals(horaNueva));
    }
    public boolean estaEnFecha(LocalDate fechaX){
        return this.fecha.equals(fechaX);
    }
}
