package Ejercicio3;

public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario;

    public Item() {
    }
    public Item(String detalle, int cantidad, double costoUnitario) {
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
    }

    public double costo() {
        return this.costoUnitario * (double)this.cantidad;
    }
    public String getDetalle() {
        return this.detalle;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    public double getCostoUnitario() {
        return this.costoUnitario;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
}
