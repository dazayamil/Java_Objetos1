package Parciales.ResolucionParcial02;

public class Orco extends Personaje{
    private int contador;
    public Orco(String nombre, Rol rol){
        super(nombre, rol);
        this.setearHabilidades();
        this.contador = 0;
    }

    @Override
    public double poderDeAtaque(int hora) {
        double valorBase = super.poderDeAtaque(hora);
        return this.momentoDelDia(hora).equals("noche") ? valorBase * 1.60 : valorBase;
    }

    @Override
    public void subirNivel() {
        this.nivel++;
        this.contador++;
        if(this.nivel == 3){
            this.rol.incrementarHabilidades(this);
            this.contador=0;
        }
    }

    @Override
    protected void setearHabilidades() {
        this.fuerza = 2;
        this.inteligencia = 1;
    }
}
