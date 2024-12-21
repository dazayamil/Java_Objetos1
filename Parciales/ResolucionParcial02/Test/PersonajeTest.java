package Parciales.ResolucionParcial02.Test;
import Parciales.ResolucionParcial02.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void personajeConNivelSuficiente(){
        for(int i=0; i < 6; i++){
            humano.subirNivel();
        }
        assertTrue(humano.subirNivel());

        orco.subirNivel();
        orco.subirNivel();
        assertTrue(orco.subirNivel());
    }

    @Test
    void personajeSinNivel(){
        assertFalse(humano.subirNivel());
        assertFalse(orco.subirNivel());
    }
}
