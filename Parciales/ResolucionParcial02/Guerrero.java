package Parciales.ResolucionParcial02;

public class Guerrero implements Rol{

    public Guerrero(){}
    @Override
    public double valorBase(Personaje p) {
        return (p.getFuerza() * 2) + p.getNivel() + p.getInteligencia();
    }
}
