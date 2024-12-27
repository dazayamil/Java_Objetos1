package Distribuidora.Test;

import Distribuidora.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientesTest {
    Cliente cliente;
    Pedido pedido;
    Item item;

    @BeforeEach
    void setUp(){
        cliente = new Cliente("Java", "Javabackend@gmail.com");
        pedido = new Pedido();
    }

    @Test
    public void testNombre(){
        assertEquals("Java", cliente.getNombre());
    }
}
