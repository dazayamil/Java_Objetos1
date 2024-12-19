package Ejercicio25_Veterinaria;

public class Vacunacion extends ServicioConMedico{
    private String nombre;
    private double costo;
    public Vacunacion(Mascota mascota, Medico medico, String nombre, double costo){
        super(mascota, medico);
        this.nombre = nombre;
        this.costo = costo;
    }
}
