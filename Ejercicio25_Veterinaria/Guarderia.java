package Ejercicio25_Veterinaria;

public class Guarderia extends Servicio{
    private int cantidadDias;
    public Guarderia(Mascota mascota, int cantidadDias){
        super(mascota);
        this.cantidadDias = cantidadDias;
    }

    @Override
    public double costoServicio( ) {
        double totalBase = this.cantidadDias * 500;
        double totalConDescuento = totalBase * 0.60;
        return this.mascota.getCantidadServicio() > 5 ? totalConDescuento : totalBase;
    }
}
