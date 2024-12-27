package Ejercicio15;

import java.time.LocalDate;

public class Factura {
    private Usuario usuarioACobrar;
    private LocalDate fechaEmision;
    private double bonificacion;
    private double montoFinal;

    public Factura(Usuario user) {
        this.usuarioACobrar = user;
        this.fechaEmision = LocalDate.now();
        this.bonificacion = 0.0;
        this.montoFinal = 0.0;
        this.verificarBonificacion();
    }

    public double verificarBonificacion() {
        return 0.0;
    }
}
