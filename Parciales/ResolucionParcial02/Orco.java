package Parciales.ResolucionParcial02;

public class Orco extends Personaje{
    private int contador;
    public Orco(String nombre, Rol rol){
        super(nombre, rol);
        setInteligencia(1);
        setFuerza(2);
        this.contador = 0;
    }

    @Override
    public double poderDeAtaque(int hora) {
        double valorBase = super.poderDeAtaque(hora);
        return this.momentoDelDia(hora).equals("noche") ? valorBase * 1.60 : valorBase;
    }
}
