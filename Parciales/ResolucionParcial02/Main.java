package Parciales.ResolucionParcial02;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago();
        Guerrero guerrero = new Guerrero();
        Humano humano = new Humano("Aragon", mago);
        Orco orco = new Orco("Saruman", guerrero);

        humano.enfrentarA(orco, 12);
        humano.cambiarRol(guerrero);

        humano.enfrentarA(orco,14);
    }
}
