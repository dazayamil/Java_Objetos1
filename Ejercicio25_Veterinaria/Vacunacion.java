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
    public double costoServicio(double costo) {
        return super.costosAdicionales(costo) + this.costoVacunacion;
    }
}
