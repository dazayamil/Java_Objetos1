package Ejercicio4;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto() {
    }

    public Producto(double peso, double precioPorKilo, String descripcion) {
        this.peso = peso;
        this.precioPorKilo = precioPorKilo;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precioPorKilo * this.peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecioPorKilo() {
        return this.precioPorKilo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
