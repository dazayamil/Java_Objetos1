package Ejercicio25_Veterinaria;

public class Guarderia extends Servicio{
    private int cantidadDias;
    public Guarderia(Mascota mascota, int cantidadDias){
        super(mascota);
        this.cantidadDias = cantidadDias;
    }

    @Override
    public double costoServicio( ) {
        double costoBase = this.cantidadDias * 500;
        double costoConDescuento = costoBase * 0.60;
        return this.mascota.getCantidadServicio() > 5 ? costoConDescuento : costoBase;
    }
}
