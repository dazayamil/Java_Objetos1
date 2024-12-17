package Parciales.ResolucionParcial02;

public class Mago implements Rol{
    public Mago(){};

    @Override
    public double valorBase(Personaje p) {
        return (p.getInteligencia() + p.getNivel()) * 2;
    }

    @Override
    public void incrementarHabilidades(Personaje p) {
        p.incrementarInteligencia((int) Math.abs(3.2 * p.getNivel()));
    }
}
