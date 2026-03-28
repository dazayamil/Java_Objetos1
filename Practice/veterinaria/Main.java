package Practice.veterinaria;


public class Main {
    public static void main(String[] args) {
        Mascota frido = new Mascota("Frido", "Labrador", 1);
        Mascota rex = new Mascota("Rex", "Aleman", 2);

        frido.cumplirAnios();
        rex.setNombre("Rexis");

        System.out.println(frido.toString());
    }
}
