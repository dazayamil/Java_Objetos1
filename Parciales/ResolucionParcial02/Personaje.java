package Parciales.ResolucionParcial02;

import java.util.List;
import java.util.stream.Collectors;

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

    public void enfrentarA(Personaje oponente, int hora){
        double poderP1 = this.poderDeAtaque(hora);
        double poderP2 = oponente.poderDeAtaque(hora);
        if(poderP1 > poderP2){
            this.subirNivel();
        } else if (poderP2 > poderP1) {
            oponente.subirNivel();
        } else {
            this.subirNivel();
            oponente.subirNivel();
        }
    }

    private boolean cumpleIgualdad(Personaje p1, int hora){
        return ((this.nivel == p1.getNivel()) && (p1.poderDeAtaque(hora) > 5)) || (this.nivel % p1.getNivel() <= 2);

    }

    public List<Personaje> buscarOponentes(List<Personaje> listaOponentes){
        return listaOponentes.stream()
                .filter( oponente -> this.cumpleIgualdad(oponente, 12))
                .collect(Collectors.toList());
    }
}
