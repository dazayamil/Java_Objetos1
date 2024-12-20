package Ejercicio25_Veterinaria;

public class Vacunacion extends ServicioConMedico{
    private String nombre;
    private double costoVacunacion;
    public Vacunacion(Mascota mascota, Medico medico, String nombre, double costoVacunacion){
        super(mascota, medico);
        this.nombre = nombre;
        this.costoVacunacion = costoVacunacion;
    }

    @Override
    public double costoServicio() {
        return super.costosAdicionales() + 500 + this.costoVacunacion;
    }
}
