package Ejercicio13;

import java.util.ArrayList;
import java.util.List;
public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;

    public ClienteDeCorreo(String carpetaInbox) {
        this.inbox = new Carpeta(carpetaInbox);
        this.carpetas = new ArrayList();
    }

    private List<Carpeta> unirCarpetas() {
        List<Carpeta> combinada = new ArrayList();
        combinada.add(this.inbox);
        combinada.addAll(this.carpetas);
        return combinada;
    }

    public void recibir(Email email) {
        this.inbox.agregarEmail(email);
    }

    private Email buscar(String texto) {
        return (Email)this.unirCarpetas().stream().map((carpeta) -> {
            return carpeta.buscarEmail(texto);
        }).findFirst().orElse((Email) null);
    }

    public int espacioOcupado() {
        return this.unirCarpetas().stream().mapToInt((carpeta) -> {
            return carpeta.tamanioCarpeta();
        }).sum();
    }
}
