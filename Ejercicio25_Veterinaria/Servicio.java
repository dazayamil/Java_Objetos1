package Ejercicio25_Veterinaria;

import java.time.LocalDate;

public abstract class Servicio {
    protected LocalDate fechaAtencion;
    protected Mascota mascota;

    public Servicio(Mascota mascota){
        this.fechaAtencion = LocalDate.now();
        this.mascota = mascota;
    }

    public boolean estaEnLaFecha(LocalDate fechaN){
        return this.fechaAtencion.equals(fechaN);
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public abstract double costoServicio();
}
