package GestionTurnosBarberia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
        return "Por motivos de Emergencia, el turno se cancela. Mil disculpas."
    }

    //Editar Turno
}
