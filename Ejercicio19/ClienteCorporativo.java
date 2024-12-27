package Ejercicio19;

public class ClienteCorporativo extends Cliente{
    private String cuit;

    public ClienteCorporativo(String nombre, String apellido, String cuit) {
        super(nombre, apellido);
        this.cuit = cuit;
    }
}
