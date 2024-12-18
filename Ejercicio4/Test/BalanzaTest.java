package Ejercicio4.Test;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio4.*;

public class BalanzaTest {
    private Balanza balanza;
    private Producto queso;
    private Producto jamon;

    public BalanzaTest() {
    }

    @BeforeEach
    void setUp() throws Exception {
        this.balanza = new Balanza();
        this.queso = new Producto();
        this.queso.setPeso(0.1);
        this.queso.setPrecioPorKilo(140.0);
        this.queso.setDescripcion("Queso");
        this.jamon = new Producto();
        this.jamon.setDescripcion("Jam\u00f3n");
        this.jamon.setPeso(0.1);
        this.jamon.setPrecioPorKilo(90.0);
    }

    @Test
    void testAgregarProducto() {
        this.balanza.agregarProducto(this.queso);
        Assertions.assertEquals(0.1, this.balanza.getPesoTotal());
        Assertions.assertEquals(14.0, this.balanza.getPrecioTotal());
        Assertions.assertEquals(1, this.balanza.getCantidadDeProductos());
        this.balanza.agregarProducto(this.jamon);
        Assertions.assertEquals(0.2, this.balanza.getPesoTotal());
        Assertions.assertEquals(23.0, this.balanza.getPrecioTotal());
        Assertions.assertEquals(2, this.balanza.getCantidadDeProductos());
    }

    @Test
    void testCantidadDeProductos() {
        Assertions.assertEquals(0, this.balanza.getCantidadDeProductos());
        this.balanza.agregarProducto(this.queso);
        Assertions.assertEquals(1, this.balanza.getCantidadDeProductos());
        this.balanza.agregarProducto(this.jamon);
        Assertions.assertEquals(2, this.balanza.getCantidadDeProductos());
    }

    @Test
    void testEmitirTicket() {
        this.balanza.agregarProducto(this.queso);
        this.balanza.agregarProducto(this.jamon);
        Ticket ticket = this.balanza.emitirTicket();
        Assertions.assertEquals(0.2, ticket.getPesoTotal());
        Assertions.assertEquals(23.0, ticket.getPrecioTotal());
        Assertions.assertEquals(2, ticket.getCantidadDeProductos());
        Assertions.assertEquals(4.83, ticket.impuesto());
        Assertions.assertEquals(LocalDate.now(), ticket.getFecha());
        this.queso.setPrecioPorKilo(200.0);
        this.jamon.setPrecioPorKilo(160.0);
        Assertions.assertEquals(23.0, ticket.getPrecioTotal());
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals(0.0, this.balanza.getPesoTotal());
        Assertions.assertEquals(0.0, this.balanza.getPrecioTotal());
        Assertions.assertEquals(0, this.balanza.getCantidadDeProductos());
    }

    @Test
    void testPesoTotal() {
        Assertions.assertEquals(0.0, this.balanza.getPesoTotal());
        this.balanza.agregarProducto(this.queso);
        Assertions.assertEquals(0.1, this.balanza.getPesoTotal());
        this.balanza.agregarProducto(this.jamon);
        Assertions.assertEquals(0.2, this.balanza.getPesoTotal());
    }

    @Test
    void testPonerEnCero() {
        this.balanza.agregarProducto(this.queso);
        this.balanza.ponerEnCero();
        Assertions.assertEquals(0.0, this.balanza.getPesoTotal());
        Assertions.assertEquals(0.0, this.balanza.getPrecioTotal());
        Assertions.assertEquals(0, this.balanza.getCantidadDeProductos());
    }

    @Test
    void testPrecioTotal() {
        Assertions.assertEquals(0.0, this.balanza.getPrecioTotal());
        this.balanza.agregarProducto(this.queso);
        Assertions.assertEquals(14.0, this.balanza.getPrecioTotal());
        this.balanza.agregarProducto(this.jamon);
        Assertions.assertEquals(23.0, this.balanza.getPrecioTotal());
    }
}
