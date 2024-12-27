package Ejercicio9;

public class CuentaCorriente extends Cuenta{
    private double limiteDescubierto = 0.0;

    public CuentaCorriente() {
    }

    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public boolean puedeExtraer(double monto) {
        return this.limiteDescubierto > monto;
    }

}
