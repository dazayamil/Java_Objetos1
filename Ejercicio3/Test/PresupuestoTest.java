package Ejercicio3.Test;

import Ejercicio3.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PresupuestoTest {
    private Presupuesto presupuesto;
    private Item item1;
    private Item item2;

    public PresupuestoTest() {
    }

    @BeforeEach
    void setUp() throws Exception {
        this.presupuesto = new Presupuesto(LocalDate.of(2024, 10, 11), "Jose");
        this.item1 = new Item("Mouse", 3, 1000.0);
        this.item2 = new Item("Teclado", 5, 2500.0);
    }

    @Test
    void agregarItem() {
        Assertions.assertEquals(0, this.presupuesto.cantidadItems());
        this.presupuesto.agregarItem(this.item1);
        this.presupuesto.agregarItem(this.item2);
        Assertions.assertEquals(2, this.presupuesto.cantidadItems());
    }

    @Test
    void calcularTotal() {
        Assertions.assertEquals(0.0, this.presupuesto.calcularTotal());
        this.presupuesto.agregarItem(this.item1);
        Assertions.assertEquals(3000.0, this.presupuesto.calcularTotal());
        this.presupuesto.agregarItem(this.item2);
        Assertions.assertEquals(15500.0, this.presupuesto.calcularTotal());
    }
}
