package Distribuidora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String mail;
    private LocalDate fechaAlta;
    private List<Pedido> pedidos;

    public Cliente(String nombre, String mail){
        this.nombre = nombre;
        this.mail = mail;
        this.fechaAlta = LocalDate.now();
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Pedido registrarPedido(){
        Pedido pedido = new Pedido();
        this.pedidos.add(pedido);
        return pedido;
    }

    public int cantidadPedida(Producto producto){
        return this.pedidos.isEmpty() ? 0 : this.pedidos.stream()
                .mapToInt(pedido -> pedido.cantidadProducto(producto))
                .sum();
    }

    public double costoTotal(LocalDate fechaInicio, LocalDate fechaFin){
        return this.pedidos.isEmpty() ? 0 : this.pedidos.stream()
                .mapToDouble(p -> p.costoTotalPedido(fechaInicio, fechaFin))
                .sum();
    }

}
