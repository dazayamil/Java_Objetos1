package Ejercicio9;

public class CajaDeAhorro extends Cuenta{
    public CajaDeAhorro() {
    }

    public boolean puedeExtraer(double monto) {
        double monto2 = monto + monto * 0.02;
        return this.getSaldo() > monto2;
    }
}
