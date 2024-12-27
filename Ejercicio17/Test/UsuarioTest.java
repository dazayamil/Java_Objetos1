package Ejercicio17.Test;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio17.*;

public class UsuarioTest {
    private Usuario usuario;
    private Propiedad propiedad;

    public UsuarioTest() {
    }

    @BeforeEach
    void setUp() {
        this.usuario = new Usuario("Esteban", "7 y 507", "44330000");
        this.propiedad = new Propiedad("13 y 32", "duplex", 10000.0);
    }

    @Test
    void crearReserva() {
        LocalDate fechaInicio = LocalDate.of(2024, 10, 7);
        LocalDate fechaFin = LocalDate.of(2024, 10, 14);
        Assertions.assertTrue(this.usuario.crearReserva(this.propiedad, fechaInicio, fechaFin));
    }
}
