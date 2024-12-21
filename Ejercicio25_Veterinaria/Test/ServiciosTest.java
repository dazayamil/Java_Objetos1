package Ejercicio25_Veterinaria.Test;

import Ejercicio25_Veterinaria.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ServiciosTest {
    private ConsultaMedica consultaMedica;
    private Vacunacion vacunacion;
    private Guarderia guarderia;
    private Mascota mascota;
    private Medico medico;

    @BeforeEach
    void setUp(){
        mascota = new Mascota("Boddy", "Labrador");
        medico = new Medico("Andres Lopez", 2000);
        consultaMedica = new ConsultaMedica(mascota, medico);
        vacunacion = new Vacunacion(mascota, medico, "antirrabica", 7000);
        guarderia = new Guarderia(mascota, 5);
    }

    @Test
    void estaEnFechaX(){
        LocalDate fecha1 = LocalDate.of(2024,10,15);
        assertTrue(consultaMedica.estaEnLaFecha(LocalDate.now()));
        assertFalse(vacunacion.estaEnLaFecha(fecha1));
    }
    @Test
    void costoServicioConsultaMedica(){
        assertEquals(2300, consultaMedica.costoServicio());
        LocalDate domingo = LocalDate.of(2024,11,24);
        consultaMedica.setFechaAtencion(domingo);
        assertEquals(2500, consultaMedica.costoServicio());
    }

    @Test
    void costoServicioVacunacion(){
        assertEquals(9500, vacunacion.costoServicio());
        LocalDate domingo = LocalDate.of(2024,11,24);
        vacunacion.setFechaAtencion(domingo);
        assertEquals(9700, vacunacion.costoServicio());
    }

    @Test
    void costoServicioGuarderia(){
        assertEquals(2500, guarderia.costoServicio());
        mascota.darAltaGuarderia(5);
        mascota.darAltaGuarderia(4);
        mascota.darAltaGuarderia(12);
        mascota.darAltaGuarderia(5);
        mascota.darAltaGuarderia(7);
        mascota.darAltaGuarderia(3);
        assertEquals(1500, guarderia.costoServicio());
    }

}
