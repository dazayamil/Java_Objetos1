package Ejercicio11;

import java.util.List;
import java.util.ArrayList;

public class Inversor {
    private String nombre;
    private List<Inversion> inversiones;

    public Inversor(String nombre) {
        this.nombre = nombre;
        this.inversiones = new ArrayList();
    }

    public void addInversion(Inversion i) {
        this.inversiones.add(i);
    }

    public int sizeInversiones() {
        return this.inversiones.size();
    }

    public double valorActual() {
        return this.inversiones.stream().
                mapToDouble((i) -> i.valorActual())
                .sum();
    }
}
