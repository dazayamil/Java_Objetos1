package Ejercicio7.Test;

import Ejercicio7.Farola;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FarolaTest {
    private Farola farolaUno;
    private Farola farolaDos;

    public FarolaTest() {
    }

    @BeforeEach
    void setUp() throws Exception {
        this.farolaUno = new Farola();
        this.farolaDos = new Farola();
    }

    @Test
    void testConstructor() {
        Assertions.assertFalse(this.farolaUno.isOn(), "La farolaUno no est\u00e1 apagada");
        Assertions.assertTrue(this.farolaUno.isOff(), "La farolaUno no est\u00e1 apagada");
        Assertions.assertTrue(this.farolaUno.getNeighbors().isEmpty(), "La farolaUno no deber\u00eda tener vecinos");
    }

    @Test
    void testPairWithNeighbor() {
        this.farolaUno.pairWithNeighbor(this.farolaDos);
        Assertions.assertTrue(this.farolaUno.getNeighbors().contains(this.farolaDos));
        Assertions.assertTrue(this.farolaDos.getNeighbors().contains(this.farolaUno));
    }

    @Test
    void testTurnOnAndOff() {
        this.farolaUno.pairWithNeighbor(this.farolaDos);
        this.farolaUno.turnOn();
        Assertions.assertTrue(this.farolaUno.isOn());
        Assertions.assertTrue(this.farolaDos.isOn());
        this.farolaUno.turnOff();
        Assertions.assertFalse(this.farolaUno.isOn());
        Assertions.assertFalse(this.farolaDos.isOn());
        this.farolaDos.turnOn();
        Assertions.assertTrue(this.farolaUno.isOn());
        Assertions.assertTrue(this.farolaDos.isOn());
        this.farolaDos.turnOff();
        Assertions.assertFalse(this.farolaUno.isOn());
        Assertions.assertFalse(this.farolaDos.isOn());
    }
}
