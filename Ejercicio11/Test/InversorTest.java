package Ejercicio11.Test;

import Ejercicio11.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InversorTest {
    private Inversor inversor;
    private InversionEnAcciones inversionEnAcciones;
    private InversionEnPlazoFijo inversionEnPlazoFijo;

    public InversorTest() {
    }

    @BeforeEach
    void setUp() {
        this.inversor = new Inversor("Juan");
        this.inversionEnAcciones = new InversionEnAcciones("AAA", 10, 200.0);
        this.inversionEnPlazoFijo = new InversionEnPlazoFijo();
    }

    @Test
    void addInversion() {
        Assertions.assertEquals(0, this.inversor.sizeInversiones());
        this.inversor.addInversion(this.inversionEnAcciones);
        Assertions.assertEquals(1, this.inversor.sizeInversiones());
        this.inversor.addInversion(this.inversionEnPlazoFijo);
        Assertions.assertEquals(2, this.inversor.sizeInversiones());
    }

    @Test
    void valorActual_sinInversiones() {
        Assertions.assertEquals(0.0, this.inversor.valorActual());
    }

    @Test
    void valorActual_conInversiones() {
        this.inversor.addInversion(this.inversionEnAcciones);
        this.inversor.addInversion(this.inversionEnPlazoFijo);
    }
}
