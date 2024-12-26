package Ejercicio6.Test;
import Ejercicio6.Mamifero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
    private Mamifero nala;
    private Mamifero melquiades;
    private Mamifero mufasa;
    private Mamifero alexa;
    private Mamifero elsa;
    private Mamifero scar;
    private Mamifero sarabi;
    private Mamifero anonimo;

    public MamiferoTest() {
    }

    @BeforeEach
    void setUp() {
        this.nala = new Mamifero("Nala");
        this.melquiades = new Mamifero("Melquiades");
        this.mufasa = new Mamifero("Mufasa");
        this.alexa = new Mamifero("Alexa");
        this.elsa = new Mamifero("Elsa");
        this.scar = new Mamifero("Scar");
        this.sarabi = new Mamifero("Sarabi");
        this.anonimo = new Mamifero();
        this.alexa.setPadre(this.mufasa);
        this.alexa.setMadre(this.sarabi);
        this.mufasa.setPadre(this.melquiades);
        this.mufasa.setMadre(this.nala);
        this.sarabi.setPadre(this.scar);
        this.sarabi.setMadre(this.elsa);
    }

    @Test
    void testAbuelaMaterna() {
        Assertions.assertEquals(this.elsa, this.alexa.getAbuelaMaterna());
        Assertions.assertNull(this.sarabi.getAbuelaMaterna());
        Assertions.assertNull(this.elsa.getAbuelaMaterna());
    }

    @Test
    void testAbuelaPaterna() {
        Assertions.assertEquals(this.nala, this.alexa.getAbuelaPaterna());
        Assertions.assertNull(this.mufasa.getAbuelaPaterna());
        Assertions.assertNull(this.nala.getAbuelaPaterna());
    }

    @Test
    void testAbueloMaterno() {
        Assertions.assertEquals(this.scar, this.alexa.getAbueloMaterno());
        Assertions.assertNull(this.sarabi.getAbueloMaterno());
        Assertions.assertNull(this.scar.getAbueloMaterno());
    }

    @Test
    void testAbueloPaterno() {
        Assertions.assertEquals(this.melquiades, this.alexa.getAbueloPaterno());
        Assertions.assertNull(this.mufasa.getAbueloPaterno());
        Assertions.assertNull(this.melquiades.getAbueloPaterno());
    }

    @Test
    void testEspecie() {
        this.anonimo.setEspecie("Panthera leo");
        Assertions.assertEquals("Panthera leo", this.anonimo.getEspecie());
    }

    @Test
    void testIdentificador() {
        this.anonimo.setIdentificador("Nala");
        Assertions.assertEquals("Nala", this.anonimo.getIdentificador());
    }

    @Test
    void testMadre() {
        this.anonimo.setMadre(this.alexa);
        Assertions.assertEquals(this.alexa, this.anonimo.getMadre());
        Assertions.assertNull(this.nala.getMadre());
    }

    @Test
    void testPadre() {
        this.anonimo.setPadre(this.mufasa);
        Assertions.assertEquals(this.mufasa, this.anonimo.getPadre());
        Assertions.assertNull(this.nala.getPadre());
    }

    @Test
    void testTieneComoAncestroA() {
        Assertions.assertFalse(this.nala.tieneComoAncestroA(this.anonimo));
        Assertions.assertFalse(this.mufasa.tieneComoAncestroA(this.anonimo));
        Assertions.assertFalse(this.alexa.tieneComoAncestroA(this.anonimo));
        Assertions.assertFalse(this.alexa.tieneComoAncestroA(this.alexa));
        Assertions.assertTrue(this.alexa.tieneComoAncestroA(this.mufasa));
        Assertions.assertTrue(this.alexa.tieneComoAncestroA(this.sarabi));
        Assertions.assertTrue(this.alexa.tieneComoAncestroA(this.nala));
        Assertions.assertTrue(this.alexa.tieneComoAncestroA(this.melquiades));
        Assertions.assertTrue(this.alexa.tieneComoAncestroA(this.elsa));
        Assertions.assertTrue(this.alexa.tieneComoAncestroA(this.scar));
    }

    @Test
    void testTieneComoAncestroAsimetrico() {
        Mamifero alice = new Mamifero("Alice");
        Mamifero aaron = new Mamifero("Aaron");
        Mamifero anna = new Mamifero("Anna");
        Mamifero alexander = new Mamifero("Alexander");
        alice.setPadre(aaron);
        aaron.setMadre(anna);
        anna.setPadre(alexander);
        Assertions.assertTrue(alice.tieneComoAncestroA(anna));
        Assertions.assertTrue(alice.tieneComoAncestroA(aaron));
        Assertions.assertTrue(alice.tieneComoAncestroA(alexander));
        Assertions.assertFalse(alice.tieneComoAncestroA(this.nala));
        Assertions.assertFalse(alice.tieneComoAncestroA(alice));
    }
}
