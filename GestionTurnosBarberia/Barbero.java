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

    //Reservar Turno Cliente

    //Aceptar Turno, pasa de "Pendiente" a "Aceptado"

    //Cancelar Turno

    //Editar Turno
}
