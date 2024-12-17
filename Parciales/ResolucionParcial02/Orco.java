package Parciales.ResolucionParcial02;

public class Orco extends Personaje{
    private int contador;
    public Orco(String nombre, Rol rol){
        super(nombre, rol);
        setInteligencia(1);
        setFuerza(2);
        this.contador = 0;
    }
}
