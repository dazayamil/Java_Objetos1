package Parciales.ResolucionParcial02;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int inteligencia;
    protected int fuerza;
    protected Rol rol;

    public Personaje(String nombre, Rol rol){
        this.nombre = nombre;
        this.rol = rol;
        this.nivel = 1;
    }

    public int getFuerza() {
        return fuerza;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public int getNivel() {
        return nivel;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double poderDeAtaque(){
        return 0;
    }
}
