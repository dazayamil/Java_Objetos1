package Ejercicio4.Test;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio4.Producto;

public class ProductoTest {
    private Producto queso;

    public ProductoTest() {
    }

    @BeforeEach
    void setUp() throws Exception {
        this.queso = new Producto();
    }

    @Test
    void testDescripcion() {
        this.queso.setDescripcion("Queso crema");
        Assertions.assertEquals("Queso crema", this.queso.getDescripcion());
    }

    @Test
    void testPeso() {
        this.queso.setPeso(100.0);
        Assertions.assertEquals(100.0, this.queso.getPeso());
    }

    @Test
    void testPrecioPorKilo() {
        this.queso.setPrecioPorKilo(100.0);
        Assertions.assertEquals(100.0, this.queso.getPrecioPorKilo());
    }

    @Test
    void testPrecio() {
        this.queso.setPeso(0.1);
        this.queso.setPrecioPorKilo(140.0);
        Assertions.assertEquals(14.0, this.queso.getPrecio());
    }
}
