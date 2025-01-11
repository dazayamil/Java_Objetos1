package GestionTurnosBarberia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Barbero {
    private String nombre;
    private LocalDate fechaIngreso;
    private double tarifaBase;

    private List<Turno> registroTurnos;
    private List<Turno> turnosCancelados;

    public Barbero(String nombre, double tarifaBase){
        this.nombre = nombre;
        this.tarifaBase = tarifaBase;
        this.registroTurnos = new ArrayList<>();
        this.turnosCancelados = new ArrayList<>();
    }

    public double getTarifaBase() {
        return this.tarifaBase;
    }

    public void reservarTurnoCliente(Cliente c, LocalDate fechaN, String hora, TipoServicio servicio){
        Turno turno = new Turno(fechaN, hora, servicio, this, c);
        this.registroTurnos.add(turno);
    }

    public void aceptarTurno(Turno turno, Cliente c){
        turno.setEstado("aceptado");
        c.agregarTurno(turno);
    }

    public String cancelarTurno(Turno turno, Cliente c){
        this.turnosCancelados.add(turno);
        c.turnoCancelado(turno);
        this.registroTurnos.remove(turno);
        return "Por motivos de Emergencia, el turno se cancela. Mil disculpas.";
    }

    public boolean editarTurno(Turno turno, LocalDate fechaNueva, String horaNueva){
        boolean estaOcupado = this.registroTurnos.stream()
                .anyMatch(t -> t.estaLibre(fechaNueva, horaNueva));
        if(estaOcupado){
            return false;
        }
        turno.cambiarFechaYHora(fechaNueva,horaNueva);
        return true;
    }

    public List<Turno> turnosAtentidosEnFechaDada(LocalDate fechaX){
        return this.registroTurnos.stream()
                .filter(t -> t.estaEnFecha(fechaX))
                .filter(t -> t.getEstado().equals("aceptado"))
                .collect(Collectors.toList());
    }

    public double gananciasEnFechaN(LocalDate fechaX){
        return this.registroTurnos.stream()
                .filter(t -> t.estaEnFecha(fechaX))
                .mapToDouble(t -> t.costoTotalTurno())
                .sum();
    }

}
