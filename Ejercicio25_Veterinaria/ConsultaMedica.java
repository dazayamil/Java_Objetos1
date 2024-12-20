package Ejercicio25_Veterinaria;

public class ConsultaMedica extends ServicioConMedico{
    public ConsultaMedica(Mascota mascota, Medico medico){
        super(mascota, medico);
    }

    @Override
    public double costoServicio( ) {
        return super.costosAdicionales() + 300 + medico.antiguedad();
    }
}
