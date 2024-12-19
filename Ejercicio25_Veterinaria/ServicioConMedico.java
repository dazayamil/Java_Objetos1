package Ejercicio25_Veterinaria;

import java.time.DayOfWeek;

public abstract class ServicioConMedico extends Servicio{
    protected Medico medico;

    public ServicioConMedico(Mascota mascota, Medico medico){
        super(mascota);
        this.medico = medico;
    }

    private double adicionalDomingo(){
        return this.fechaAtencion.getDayOfWeek() == DayOfWeek.SUNDAY ? 200 : 0;
    }

    public double costosAdicionales(double costo){
        return this.medico.getHonorarios() + costo + adicionalDomingo();
    }

}
