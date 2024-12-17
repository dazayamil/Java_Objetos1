package Parciales.ResolucionParcial02;

public class Humano extends Personaje{
    public Humano(String nombre, Rol rol){
        super(nombre, rol);
        setInteligencia(2);
        setFuerza(1);
    }
}
