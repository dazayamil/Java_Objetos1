package Distribuidora;

public class ProductoNacional extends Producto{
    public ProductoNacional(String nombre, double costoUnitario, String descripcion){
        super(nombre, costoUnitario, descripcion);
    }

    @Override
    public double impuestoProducto() {
        return 0;
    }
}
