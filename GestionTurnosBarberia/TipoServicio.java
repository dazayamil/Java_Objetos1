package GestionTurnosBarberia;

public enum TipoServicio {
    CORTE(2000,20, "Corte con Navaja"),
    AFEITADO(1000, 10, "Afeitado Completo"),
    COLOR(4000, 60, "Coloracion del cabello"),
    BARBA_Y_CORTE(4000, 30, "Corte tradicional + barba");
    private double costo;
    private int duracion;
    private String descripcion;

    TipoServicio(double costo, int duracion, String descripcion){
        this.costo = costo;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return this.costo;
    }
    public int getDuracion() {
        return this.duracion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
}
