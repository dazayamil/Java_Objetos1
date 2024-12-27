package Distribuidora;

public class Item {
    private Pedido pedido;
    private Producto producto;
    private int cantidadPedido;

    public Item(Pedido pedido, Producto producto, int cantidadPedido){
        this.pedido = pedido;
        this.producto = producto;
        this.cantidadPedido = cantidadPedido;
    }

    public boolean productoPedido(Producto producto){
        return this.producto.equals(producto);
    }

    public int getCantidadPedido() {
        return this.cantidadPedido;
    }

    public double costoTotalItem(){
        return this.producto.getCostoUnitario() * this.cantidadPedido;
    }
}
