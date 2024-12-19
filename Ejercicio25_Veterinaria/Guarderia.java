package Ejercicio25_Veterinaria;

public class Guarderia extends Servicio{
    private int cantidadDias;
    public Guarderia(Mascota mascota, int cantidadDias){
        super(mascota);
        this.cantidadDias = cantidadDias;
    }
}
