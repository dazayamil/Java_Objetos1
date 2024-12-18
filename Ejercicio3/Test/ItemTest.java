package Ejercicio3.Test;

import Ejercicio3.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ItemTest {
    Item mouse;
    Item teclado;

    public ItemTest() {
    }

    @BeforeEach
    void setup() throws Exception {
        this.mouse = new Item();
        this.teclado = new Item("Teclado", 3, 1500.0);
    }

    @Test
    void costo() {
        Assertions.assertEquals(0.0, this.mouse.costo());
        Assertions.assertEquals(4500.0, this.teclado.costo());
    }

    @Test
    void getDetalle() {
        Assertions.assertEquals((Object)null, this.mouse.getDetalle());
        this.mouse.setDetalle("Mouse");
        Assertions.assertEquals("Mouse", this.mouse.getDetalle());
        Assertions.assertEquals("Teclado", this.teclado.getDetalle());
    }

    @Test
    void getCantidad() {
        Assertions.assertEquals(0, this.mouse.getCantidad());
        this.mouse.setCantidad(5);
        Assertions.assertEquals(5, this.mouse.getCantidad());
        Assertions.assertEquals(3, this.teclado.getCantidad());
    }
}
