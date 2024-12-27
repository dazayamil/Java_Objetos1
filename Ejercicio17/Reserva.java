package Ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Propiedad propiedad;

    public Reserva() {
    }

    public Reserva(LocalDate fechaInicio, LocalDate fechaFin, Propiedad propiedad) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.propiedad = propiedad;
    }

    public double costoReserva() {
        int dias = (int)ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);
        return (double)dias * this.propiedad.getPrecioPorNoche();
    }

    public boolean estaEnCurso() {
        return this.fechaInicio.isAfter(LocalDate.now());
    }

    public boolean estaOcupado(LocalDate fechaI, LocalDate fechaF) {
        return !fechaF.isBefore(this.fechaInicio) && !fechaI.isAfter(this.fechaFin);
    }

    public boolean estaEnElPeriodo(LocalDate fechaI, LocalDate fechaF) {
        return fechaI.isAfter(this.fechaInicio) && fechaF.isBefore(this.fechaFin);
    }
}
