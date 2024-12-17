package Parciales.ResolucionParcial02;

public class Guerrero implements Rol{

    public Guerrero(){}
    @Override
    public double valorBase(Personaje p) {
        return (p.getFuerza() * 2) + p.getNivel() + p.getInteligencia();
    }

    @Override
    public void incrementarHabilidades(Personaje p) {
        p.incrementarFuerza((int)Math.abs(p.getNivel() / 6));
    }
}
