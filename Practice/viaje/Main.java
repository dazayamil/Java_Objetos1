package Practice.viaje;

public class Main {
    public static void main(String[] args) {
        Pasaje pasajeA = new Pasaje(20,123456);
        Pasaje pasajeB = new Pasaje(20,123456);
        System.out.println(pasajeA == pasajeB);
    }
}
