package Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> items;

    public Presupuesto() {
        this.items = new ArrayList();
    }

    public Presupuesto(LocalDate fecha, String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.items = new ArrayList();
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }

    public double calcularTotal() {
        return this.items.stream().mapToDouble((item) -> {
            return item.costo();
        }).sum();
    }

    public int cantidadItems() {
        return this.items.size();
    }
}
