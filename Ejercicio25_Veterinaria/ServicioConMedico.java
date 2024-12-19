package Ejercicio25_Veterinaria;

public abstract class ServicioConMedico extends Servicio{
    protected Medico medico;

    public ServicioConMedico(Mascota mascota, Medico medico){
        super(mascota);
        this.medico = medico;
    }
}
