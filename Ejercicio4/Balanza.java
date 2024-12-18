package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private int cantidadDeProductos = 0;
    private double precioTotal = 0.0;
    private double pesoTotal = 0.0;
    private List<Producto> productos = new ArrayList();

    public Balanza() {
    }

    public void ponerEnCero() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0.0;
        this.pesoTotal = 0.0;
        this.productos.clear();
    }

    public void agregarProducto(Producto prod) {
        ++this.cantidadDeProductos;
        this.productos.add(prod);
    }

    public Ticket emitirTicket() {
        Ticket ticket = new Ticket(this.cantidadDeProductos, this.getPesoTotal(), this.getPrecioTotal());
        this.ponerEnCero();
        return ticket;
    }

    public double getPesoTotal() {
        return this.productos.stream()
                .mapToDouble(p -> p.getPeso())
                .sum();
    }

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }

    public double getPrecioTotal() {
        return this.productos.stream()
                .mapToDouble(p -> p.getPrecio())
                .sum();
    }

}
