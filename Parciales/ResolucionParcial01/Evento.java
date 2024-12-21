package Parciales.ResolucionParcial01;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;

public abstract class Evento {
    protected String nombre;
    protected LocalDate fecha;
    protected String temaPrincipal;
    protected double precioInscripcion;
    protected double precioRemera;

    public Evento(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera){
        this.nombre = nombre;
        this.fecha = fecha;
        this.temaPrincipal = temaPrincipal;
        this.precioInscripcion = precioInscripcion;
        this.precioRemera = precioRemera;
    }
}
