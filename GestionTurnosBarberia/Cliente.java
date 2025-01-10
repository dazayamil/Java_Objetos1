package GestionTurnosBarberia;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String telefono;
    private List<Turno> turnos;

    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.turnos = new ArrayList<>();
    }

    public void agregarTurno(Turno turno){
        this.turnos.add(turno);
    }

    public void turnoCancelado(Turno turno){
        this.turnos.remove(turno);
    }
}
