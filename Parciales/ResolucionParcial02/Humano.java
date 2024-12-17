package Parciales.ResolucionParcial02;

public class Humano extends Personaje{
    public Humano(String nombre, Rol rol){
        super(nombre, rol);
        this.setearHabilidades();
    }

    @Override
    public double poderDeAtaque(int hora) {
        double valorBase = super.poderDeAtaque(hora);
        return this.momentoDelDia(hora).equals("dia") ? valorBase * 1.40 : valorBase;
    }

    @Override
    public void subirNivel() {
        this.nivel++;
        if(this.nivel > 7){
            this.rol.incrementarHabilidades(this);
        }
    }

    @Override
    protected void setearHabilidades() {
        this.inteligencia = 2;
        this.fuerza = 1;
    }
}
