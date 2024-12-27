package Distribuidora;

public abstract class Producto {
    protected String nombre;
    protected double costoUnitario;
    protected String descripcion;

    public Producto(String nombre, double costoUnitario, String descripcion){
        this.nombre = nombre;
        this.costoUnitario = costoUnitario;
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCostoUnitario() {
        return costoUnitario;
    }

    public abstract double impuestoProducto();
}
