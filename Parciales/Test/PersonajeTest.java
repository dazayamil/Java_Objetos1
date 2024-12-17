package Parciales.Test;
import Parciales.ResolucionParcial02.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonajeTest {
    private Humano humano;
    private Orco orco;
    private Mago mago;
    private Guerrero guerrero;

    @BeforeEach
    void setUp(){
        mago = new Mago();
        guerrero = new Guerrero();
        humano = new Humano("Aragon", guerrero);
        orco = new Orco("Saruman", mago);
    }

    @Test
    void poderDeAtaque(){
        assertEquals(5, humano.poderDeAtaque(22));
        assertEquals(4, orco.poderDeAtaque(17));
    }
}
