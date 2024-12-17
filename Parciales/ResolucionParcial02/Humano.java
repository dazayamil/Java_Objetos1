package Parciales.ResolucionParcial02;

public class Humano extends Personaje{
    public Humano(String nombre, Rol rol){
        super(nombre, rol);
        setInteligencia(2);
        setFuerza(1);
    }

    @Override
    public double poderDeAtaque(int hora) {
        double valorBase = super.poderDeAtaque(hora);
        return this.momentoDelDia(hora).equals("dia") ? valorBase * 1.40 : valorBase;
    }
}
