package Distribuidora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate fechaPedido;
    private List<Item> items;

    public Pedido(){
        this.fechaPedido = LocalDate.now();
        this.items = new ArrayList<Item>();
    }

    public void agregarItem(Producto producto, int cantidadPedido){
        Item item = new Item(this, producto, cantidadPedido);
        this.items.add(item);
    }

    public int cantidadProducto(Producto producto){
        return this.items.isEmpty() ? 0 : this.items.stream()
                .filter(item -> item.productoPedido(producto))
                .mapToInt(item -> item.getCantidadPedido())
                .sum();
    }

    public double costoTotalPedido(LocalDate fechaInicio, LocalDate fechaFin){
        return 0;
    }

}
