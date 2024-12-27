package Distribuidora;

public class ProductoImportado extends Producto{
    private String paisOrigen;

    public ProductoImportado(String nombre, double costoUnitario, String descripcion, String paisOrigen){
        super(nombre, costoUnitario, descripcion);
        this.paisOrigen = paisOrigen;
    }

    @Override
    public double impuestoProducto() {
        return 0;
    }
}
