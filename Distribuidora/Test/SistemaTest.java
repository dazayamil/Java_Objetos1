package Distribuidora.Test;

import Distribuidora.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaTest {
    Sistema sistema;
    Cliente cliente1, cliente2, cliente3;
    Pedido p1, p2, p3;
    Producto productoNacional, productoX;


    @BeforeEach
    void setUp(){
        sistema = new Sistema();
        productoNacional = sistema.registrarProductoNacional("ASUS", 200000,"notebook 2024");
        cliente1 = sistema.registrarCliente("Juan" , "Juan1@gmail.com");
        cliente2 = sistema.registrarCliente("Luis", "Luis2@gmail.com");
        cliente3 = sistema.registrarCliente("Pedro", "Pedro3@gmail.com");
        p1 = cliente1.registrarPedido();
        p2 = cliente2.registrarPedido();
        p3 = cliente3.registrarPedido();
        p1.agregarItem(productoNacional, 5);
        p2.agregarItem(productoNacional, 3);
        p3.agregarItem(productoNacional, 2);
    }

    @Test
    public void testCantidadSolicitadaDeUnProducto(){
        assertEquals(10, sistema.cantidadSolicitadaDeUnProducto(productoNacional));
        productoX = new ProductoNacional("INBOX", 100000, "notebook 01");
        assertEquals(0, sistema.cantidadSolicitadaDeUnProducto(productoX));
    }
}
