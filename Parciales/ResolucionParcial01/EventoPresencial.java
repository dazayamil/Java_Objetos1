package Parciales.ResolucionParcial01;

import java.time.LocalDate;

public class EventoPresencial extends Evento{

    public EventoPresencial(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera){
        super(nombre, fecha, temaPrincipal, precioInscripcion, precioRemera);
    }
}
