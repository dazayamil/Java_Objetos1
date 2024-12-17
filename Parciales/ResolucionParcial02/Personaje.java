package Parciales.ResolucionParcial02;

public abstract class Personaje {
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

    protected String momentoDelDia(int hora){
        return (hora >= 8 && hora <= 20) ? "dia" : "noche";
    }
    public double poderDeAtaque(int hora){
        return this.rol.valorBase(this);
    }

    public void incrementarInteligencia(int valor){ this.inteligencia += valor;}
    public void incrementarFuerza(int valor){this.fuerza += valor;}

    public abstract void subirNivel();
}
