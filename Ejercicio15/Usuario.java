package Ejercicio15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Usuario {
    private String nombre;
    private String domicilio;
    private List<Consumo> consumos;

    public Usuario(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.consumos = new ArrayList();
    }

    public void agregarConsumoOrdenado(Consumo c) {
        int index = Collections.binarySearch(this.consumos, c, Comparator.comparing((consumo) -> {
            return consumo.getFecha();
        }));
        if (index < 0) {
            index = -index - 1;
        }

        this.consumos.add(index, c);
    }

    public Factura emitirFactura() {
        return null;
    }
}
